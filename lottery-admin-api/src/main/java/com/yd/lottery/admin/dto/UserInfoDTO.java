package com.yd.lottery.admin.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @program: litemall
 * @description:
 * @author: 二师兄
 * @create: 2019-10-21 16:32
 **/
@Data
public class UserInfoDTO {
    /**
     * kid
     */
    private Long kid;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 余额
     */
    private BigDecimal balance;
    /**
     * 冻结余额
     */
    private BigDecimal amountFrozen;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 注册时间
     */
    private LocalDateTime createTime;
    /**
     * 来源项目
     */
    private String channelId;

    /**
     * 注册方式
     */
    private String registerType;


    /**
     * 累计获得奖金
     */
    private BigDecimal totalProfitAmount;
    /**
     * 累计投入金额
     */
    private BigDecimal totalInvestAmount;
    /**
     * 参与总次数
     */
    private Integer totalCountJoined;

    /**
     * 成功打卡次数
     */
    private Integer totalCountClocked;

}
