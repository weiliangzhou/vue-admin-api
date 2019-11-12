package com.yd.lottery.admin.service;

import com.yd.lottery.admin.dto.ClockInTotalDTO;
import com.yd.lottery.admin.enums.ChannelIdEnum;
import com.yd.lottery.db.dao.StatMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class StatService {
    @Resource
    private StatMapper statMapper;
    @Resource
    private UserBaseService userBaseService;

    public List<Map> statUser() {
        return statMapper.statUser();
    }

    public List<Map> statOrder() {
        return statMapper.statOrder();
    }

    public List<Map> statGoods() {
        return statMapper.statGoods();
    }

    /**
     * 打卡用户统计
     *
     * @return
     */
    public ClockInTotalDTO reqClockInTotalInfo() {
        ClockInTotalDTO clockInTotalDTO = new ClockInTotalDTO();
        /**
         * 累计参与总人次
         */
        Long totalCountJoined = statMapper.totalCountJoined();
        /**
         * 累计打卡总人次
         */
        Long totalCountClocked = statMapper.totalCountClocked();
        /**
         * 累计奖池总金额
         */
        BigDecimal totalJackpotAmount = BigDecimal.ZERO;
        /**
         * 累计公益基金总额
         */
        BigDecimal totalWAQFFundAmount = BigDecimal.ZERO;
        /**
         * 总计用户数量
         */
        Long totalUserCount = userBaseService.reqTotalUserCountByChannelId(ChannelIdEnum.DK_10001.getCode());
        /**
         * 今日注册人数
         */
        Long todayRegisterCount = userBaseService.reqTodayUserCountByChannelId(ChannelIdEnum.DK_10001.getCode());
        /**
         * 今日参与人数
         */
        Long todayTakeInCount = statMapper.todayTakeInCount();
        clockInTotalDTO.setTotalCountJoined(totalCountJoined);
        clockInTotalDTO.setTotalCountClocked(totalCountClocked);
        clockInTotalDTO.setTotalJackpotAmount(totalJackpotAmount);
        clockInTotalDTO.setTotalWAQFFundAmount(totalWAQFFundAmount);
        clockInTotalDTO.setTotalUserCount(totalUserCount);
        clockInTotalDTO.setTodayRegisterCount(todayRegisterCount);
        clockInTotalDTO.setTodayTakeInCount(todayTakeInCount);


        return clockInTotalDTO;
    }
}
