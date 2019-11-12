package com.yd.lottery.admin.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: litemall
 * @description: 打卡用户统计
 * @author: 二师兄
 * @create: 2019-10-21 17:12
 **/
@Data
public class ClockInTotalDTO {
    /**
     * 累计参与总人次
     */
    Long totalCountJoined;
    /**
     * 累计打卡总人次
     */
    Long totalCountClocked;
    /**
     * 累计奖池总金额
     */
    BigDecimal totalJackpotAmount;
    /**
     * 累计公益基金总额
     */
    BigDecimal totalWAQFFundAmount;
    /**
     * 总计用户数量
     */
    Long totalUserCount;
    /**
     * 今日注册人数
     */
    Long todayRegisterCount;
    /**
     * 今日参与人数
     */
    Long todayTakeInCount;

}
