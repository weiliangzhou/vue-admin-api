package com.yd.lottery.admin.service;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yd.lottery.admin.dto.PrizeAddDTO;
import com.yd.lottery.admin.dto.PrizeInfoDTO;
import com.yd.lottery.admin.dto.PrizeUpdateDTO;
import com.yd.lottery.admin.utils.KidUtils;
import com.yd.lottery.core.exception.BizException;
import com.yd.lottery.core.exception.ErrorEnum;
import com.yd.lottery.db.dao.PrizeMapper;
import com.yd.lottery.db.dao.PrizePlayerMapper;
import com.yd.lottery.db.dao.UserMessageMapper;
import com.yd.lottery.db.domain.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

/**
 * @program: litemall
 * @description: 抽奖
 * @author: 二师兄
 * @create: 2019-10-14 19:26
 **/
@Service
@Slf4j
public class PrizeService {
    @Autowired
    private PrizeMapper prizeMapper;
    @Autowired
    private PrizePlayerMapper prizePlayerMapper;
    @Autowired
    private UserBaseService userBaseService;
    @Autowired
    private UserMessageMapper userMessageMapper;

    public PageInfo<Prize> list(String prizeName, LocalDateTime startTime, LocalDateTime endTime, Integer page, Integer limit, String sort, String order) {

        PrizeExample example = new PrizeExample();
        PrizeExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(prizeName)) {
            criteria.andNameLike("%" + prizeName + "%");
        }

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        if (null != startTime) {
            criteria.andCreateTimeGreaterThanOrEqualTo(startTime);

        }
        if (null != endTime) {
            criteria.andCreateTimeLessThanOrEqualTo(endTime);

        }
        PageHelper.startPage(page, limit);
        List<Prize> prizes = prizeMapper.selectByExampleSelective(example);
        return new PageInfo<>(prizes);
    }

    public void add(PrizeAddDTO prizeAddDTO) {
        Prize prize = new Prize();
        BeanUtils.copyProperties(prizeAddDTO, prize);
        long kid = KidUtils.nextId();
        prize.setKid(kid);
        prizeMapper.insertSelective(prize);
    }

    @CacheEvict(value = "prizeDetail", key = "'prize_detail_'+#p0.kid")
    public void update(PrizeUpdateDTO prizeUpdateDTO) {
        Prize prize = new Prize();
        BeanUtils.copyProperties(prizeUpdateDTO, prize);
        prize.setUpdateTime(null);
        prize.setCreateTime(null);
        prizeMapper.updateByPrimaryKeySelective(prize);
    }

    /**
     * 开奖
     *
     * @param type     1指定用户id   2随机
     * @param prizeKid
     * @param userKid
     */
//    @CacheEvict(value = "prizeDetail", allEntries = true)
    @CacheEvict(value = "prizeDetail", key = "'prize_detail_'+#prizeKid")
    @Transactional(rollbackFor = Exception.class)
    public String openPrize(Integer type, Long prizeKid, Long userKid) {
        switch (type) {

            case 1:
                openPrizeToUserKid(prizeKid, userKid);
                sendMsgToUserKid(prizeKid, userKid);
                break;
            case 2:
                openPrizeToRandom(prizeKid);
                sendMsgToUserKid(prizeKid, userKid);
                break;
            default:

        }
        return "1";
    }

    /**
     * 随机开奖
     */

    private void openPrizeToRandom(Long prizeKid) {

        /**
         * 1.找到参与的所有人
         * 2.在1到list.size中 随机一个数字
         * 3.userKid=ArrayList[随机数]
         * 4.人数不够不能开奖
         */
        PrizePlayerExample prizePlayerExample = new PrizePlayerExample();
        prizePlayerExample.createCriteria().andPrizeKidEqualTo(prizeKid);
        List<PrizePlayer> prizePlayers = prizePlayerMapper.selectByExample(prizePlayerExample);
        int size = prizePlayers.size();
        if (size == 0) {
            throw new BizException(ErrorEnum.ALREADY_CLOSE_PRIZE);
        } else {
            checkLessPeoples(prizeKid);
        }
        Random random = new Random();
        int index = random.nextInt(prizePlayers.size());
        PrizePlayer prizePlayer = prizePlayers.get(index);
        Long userKid = prizePlayer.getUserKid();
        openPrizeToUserKid(prizeKid, userKid);

    }

    /**
     * 发送站内信
     *
     * @param userKid
     */
    private void sendMsgToUserKid(Long prizeKid, Long userKid) {
        Prize prize = prizeMapper.selectByPrimaryKey(prizeKid);
        UserMessage userMessage = new UserMessage();
        userMessage.setKid(KidUtils.nextId());
        userMessage.setUserKid(userKid);
        String name = prize.getName();
        userMessage.setContent("恭喜您，获得" + name);
        userMessageMapper.insertSelective(userMessage);

    }

    /**
     * 指定开奖
     *
     * @param prizeKid
     * @param userKid
     */
    private void openPrizeToUserKid(Long prizeKid, Long userKid) {
        /**
         * 安全机制-> 1用户不存在则报错  2prize的状态为0已结束 报错不能开奖  3该用户未参与本次抽奖
         * 1.更新 prize状态为已结束 存入开奖时间   自动下架
         * 2.更新 prize_playyer  is_winner
         */

        UserBase userBase = userBaseService.findByKid(userKid);
        if (userBase == null) {
            throw new BizException(ErrorEnum.NO_USER);
        }
        checkLessPeoples(prizeKid);
        Prize checkPrize = prizeMapper.selectByPrimaryKey(prizeKid);
        Integer drawState = checkPrize.getDrawState();
        if (drawState == 0) {
            throw new BizException(ErrorEnum.ALREADY_OPEN_PRIZE);
        }

        PrizePlayerExample prizePlayerQuery = new PrizePlayerExample();
        prizePlayerQuery.createCriteria().andPrizeKidEqualTo(prizeKid).andUserKidEqualTo(userKid);
        PrizePlayer prizePlayerTemp = prizePlayerMapper.selectOneByExample(prizePlayerQuery);
        if (prizePlayerTemp == null) {
            throw new BizException(ErrorEnum.NO_TAKE_PRIZE);
        }

        Prize prize = new Prize();
        prize.setDisplayState(0);
        prize.setDrawState(0);
        prize.setDrawTime(LocalDateTime.now());
        prize.setKid(prizeKid);
        prizeMapper.updateByPrimaryKeySelective(prize);

        PrizePlayerExample prizePlayerExample = new PrizePlayerExample();
        prizePlayerExample.createCriteria().andUserKidEqualTo(userKid).andPrizeKidEqualTo(prizeKid);
        PrizePlayer prizePlayer = new PrizePlayer();
        prizePlayer.setIsWinner(true);
        prizePlayerMapper.updateByExampleSelective(prizePlayer, prizePlayerExample);


    }

    private void checkLessPeoples(Long prizeKid) {
        PrizeExample prizeExample = new PrizeExample();
        prizeExample.createCriteria().andKidEqualTo(prizeKid);
        Prize prize = prizeMapper.selectOneByExample(prizeExample);
        Integer limitCountMin = prize.getLimitCountMin();
        Integer playerCount = prize.getPlayerCount();
        if (limitCountMin > playerCount) {
            throw new BizException(ErrorEnum.LESS_PEOPLES_PRIZE);
        }
    }

    /**
     * 查看中奖结果
     *
     * @param prizeKid
     * @return
     */
    public UserBase viewWinner(Long prizeKid) {
        PrizePlayerExample prizePlayerExample = new PrizePlayerExample();
        prizePlayerExample.createCriteria().andPrizeKidEqualTo(prizeKid).andIsWinnerEqualTo(true);
        PrizePlayer prizePlayer = prizePlayerMapper.selectOneByExample(prizePlayerExample);
        Long userKid = prizePlayer.getUserKid();
        UserBase userBase = userBaseService.findByKid(userKid);
        return userBase;
    }

    /**
     * 抽奖详情
     *
     * @param kid
     * @return
     */
    public PrizeInfoDTO findByKid(Long kid) {
        Prize prize = prizeMapper.selectByPrimaryKey(kid);
        PrizeInfoDTO prizeInfoDTO = new PrizeInfoDTO();
        BeanUtils.copyProperties(prize, prizeInfoDTO);
        return prizeInfoDTO;
    }

    /**
     * 删除抽奖
     *
     * @param kid
     */
    @Transactional(rollbackFor = Exception.class)
    public void deleteByKid(Long kid) {
        Prize prize = prizeMapper.selectByPrimaryKey(kid);
        Integer playerCount = prize.getPlayerCount();
        if (playerCount <= 0) {
            prizeMapper.deleteByPrimaryKey(kid);
        } else {
            throw new BizException(ErrorEnum.ALREADY_CANNOT_DELETED);
        }
    }

    /**
     * 上下架
     *
     * @param kid
     */
    @Transactional(rollbackFor = Exception.class)
    public void displayByKid(Long kid) {
        Prize prize = prizeMapper.selectByPrimaryKey(kid);
        Integer playerCount = prize.getPlayerCount();
        Integer displayState = prize.getDisplayState();
        if (displayState == 1) {
            if (playerCount <= 0) {
                prize.setDisplayState(0);
                prizeMapper.updateByPrimaryKeySelective(prize);
            } else {
                throw new BizException(ErrorEnum.UPPER_LOWER_FRAMES);
            }
        } else {
            prize.setDisplayState(1);
            prizeMapper.updateByPrimaryKeySelective(prize);
        }
    }
}
