package com.yd.lottery.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yd.lottery.admin.dto.UserInfoDTO;
import com.yd.lottery.admin.enums.ChannelIdEnum;
import com.yd.lottery.db.dao.ClinUserAccountMapper;
import com.yd.lottery.db.dao.ClinUserSummaryMapper;
import com.yd.lottery.db.dao.UserBaseMapper;
import com.yd.lottery.db.domain.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: litemall
 * @description: 用户基本信息
 * @author: 二师兄
 * @create: 2019-10-14 17:17
 **/
@Service
public class UserBaseService {


    @Resource
    private UserBaseMapper userBaseMapper;
    @Resource
    private ClinUserAccountMapper clinUserAccountMapper;
    @Resource
    private ClinUserSummaryMapper clinUserSummaryMapper;


    public PageInfo<UserInfoDTO> list(String nickname, String phone, Long kid, LocalDateTime startTime, LocalDateTime endTime, String channelId, Integer page, Integer limit, String sort, String order) {
        UserBaseExample example = new UserBaseExample();
        UserBaseExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(nickname)) {
            criteria.andNicknameLike("%" + nickname + "%");
        }
        if (!StringUtils.isEmpty(phone)) {
            criteria.andPhoneLike("%" + phone + "%");
        }
        if (null != kid) {
            criteria.andKidEqualTo(kid);
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
        if (!StringUtils.isEmpty(channelId)) {
            criteria.andChannelIdEqualTo(channelId);

        }
        PageHelper.startPage(page, limit);
        List<UserBase> userBases = userBaseMapper.selectByExampleSelective(example);
        PageInfo<UserBase> userBasePageInfo = new PageInfo<>(userBases);
        PageInfo<UserInfoDTO> userInfoDTOPageInfo = new PageInfo<>();
        List<UserInfoDTO> userInfoDTOS = new ArrayList<>();
        BeanUtils.copyProperties(userBasePageInfo, userInfoDTOPageInfo);

        for (UserBase userBase : userBases) {
            UserInfoDTO userInfoDTO = new UserInfoDTO();
            BeanUtils.copyProperties(userBase, userInfoDTO);
            // TODO: 2019/10/21 来源app = 打卡--->余额、参与次数、成功打卡次数、累计获得奖金
            String channelIdTemp = userBase.getChannelId();
            if (channelIdTemp.equals(ChannelIdEnum.DK_10001.getCode())) {
                Long userBaseKid = userBase.getKid();
                ClinUserAccount clinUserAccount = getClinUserAccount(userBaseKid);
                if (clinUserAccount != null) {
                    BigDecimal amount = clinUserAccount.getAmount();
                    BigDecimal amountFrozen = clinUserAccount.getAmountFrozen();
                    userInfoDTO.setBalance(amount);
                    userInfoDTO.setAmountFrozen(amountFrozen);
                }
                ClinUserSummary clinUserSummary = getClinUserClockInSummary(userBaseKid);
                if (clinUserSummary != null) {
                    BigDecimal totalInvestAmount = clinUserSummary.getTotalInvestAmount();
                    BigDecimal totalProfitAmount = clinUserSummary.getTotalProfitAmount();
                    Integer totalCountClocked = clinUserSummary.getTotalCountClocked();
                    Integer totalCountJoined = clinUserSummary.getTotalCountJoined();
                    userInfoDTO.setTotalInvestAmount(totalInvestAmount);
                    userInfoDTO.setTotalProfitAmount(totalProfitAmount);
                    userInfoDTO.setTotalCountClocked(totalCountClocked);
                    userInfoDTO.setTotalCountJoined(totalCountJoined);
                }

            }

            userInfoDTOS.add(userInfoDTO);
        }
        userInfoDTOPageInfo.setList(userInfoDTOS);
        return userInfoDTOPageInfo;

    }

    private ClinUserSummary getClinUserClockInSummary(Long userBaseKid) {
        ClinUserSummaryExample clinUserSummaryExample = new ClinUserSummaryExample();
        clinUserSummaryExample.createCriteria().andKidEqualTo(userBaseKid);
        return clinUserSummaryMapper.selectOneByExample(clinUserSummaryExample);
    }

    private ClinUserAccount getClinUserAccount(Long userBaseKid) {
        ClinUserAccountExample clinUserAccountExample = new ClinUserAccountExample();
        clinUserAccountExample.createCriteria().andKidEqualTo(userBaseKid);
        return clinUserAccountMapper.selectOneByExample(clinUserAccountExample);
    }

    public UserBase findByKid(Long kid) {
        return userBaseMapper.selectByPrimaryKey(kid);
    }

    public Long reqTotalUserCountByChannelId(String channelId) {
        UserBaseExample userBaseExample = new UserBaseExample();
        userBaseExample.createCriteria().andChannelIdEqualTo(channelId);
        return userBaseMapper.countByExample(userBaseExample);

    }

    public Long reqTodayUserCountByChannelId(String channelId) {
        UserBaseExample userBaseExample = new UserBaseExample();
        //当天的零点
        //当天的最后时间
        LocalDateTime now = LocalDateTime.now();
        userBaseExample.createCriteria().andChannelIdEqualTo(channelId).andCreateTimeBetween(LocalDateTime.of(now.toLocalDate(), LocalTime.MIN), LocalDateTime.of(now.toLocalDate(), LocalTime.MAX));
        return userBaseMapper.countByExample(userBaseExample);
    }
}
