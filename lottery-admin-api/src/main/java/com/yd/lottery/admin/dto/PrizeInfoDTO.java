package com.yd.lottery.admin.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @program: litemall
 * @description: 抽奖详情类
 * @author: 二师兄
 * @create: 2019-10-15 14:35
 **/
@Data
public class PrizeInfoDTO {
    private Long kid;
    /**
     * 名称
     */
    private String name;
    /**
     * 市场价格(分)
     */
    private Integer marketPrice;
    /**
     * 市场价格（元）
     */
    private Integer marketPriceDesc;

    public Integer getMarketPriceDesc() {
        return this.marketPrice != null ? this.marketPrice / 100 : 0;
    }


    /**
     * 成本价格(分)
     */
    private Integer costPrice;
    /**
     * 成本价格(元)
     */
    private Integer costPriceDesc;

    public Integer getCostPriceDesc() {
        return this.costPrice != null ? this.costPrice / 100 : 0;
    }

    private String imgUrl1;
    private String imgUrl2;
    private String imgUrl3;
    /**
     * 描述
     */
    private String desc;
    /**
     * 0已结束
     * 1待开奖
     */
    private Integer drawState;
    /**
     * 开始参与时间
     */
    private LocalDateTime startTime;
    /**
     * 截止时间
     */
    private LocalDateTime endTime;
    /**
     * 开奖时间
     */
    private LocalDateTime drawTime;
    /**
     * 显示状态
     * 0隐藏
     * 1显示
     */
    private Integer displayState;
    /**
     * 最低参与人数   -1不限制
     */
    private Integer limitCountMin;
    /**
     * 最高参与人数   -1不限制
     */
    private Integer limitCountMax;
    /**
     * 0无条件
     * 1看广告
     */
    private Integer limitType;
    /**
     * 0限人
     * 1限时
     * 2限时限人
     */
    private Integer activityType;
    /**
     * 参与人数
     */
    private Integer playerCount;
    /**
     * 初始参与人数
     */
    private Integer playerCountInit;
}
