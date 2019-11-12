package com.yd.lottery.admin.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.yd.lottery.admin.utils.ArithUtils;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @program: litemall
 * @description: 抽奖编辑类
 * @author: 二师兄
 * @create: 2019-10-15 14:35
 **/
@Data
public class PrizeUpdateDTO {
    private Long kid;
    /**
     * 名称
     */
    private String name;
    /**
     * 市场价格(分)
     */
    private Integer marketPrice;

    public Integer getMarketPrice() {

        return this.marketPriceDesc != null ? ArithUtils.mulInt(this.marketPriceDesc, 100) : 0;
    }

    /**
     * 市场价格（元）
     */
    private Double marketPriceDesc;


    /**
     * 成本价格(分)
     */
    private Integer costPrice;

    public Integer getCostPrice() {
        return this.costPriceDesc != null ? ArithUtils.mulInt(this.costPriceDesc, 100) : 0;
    }

    /**
     * 成本价格(元)
     */
    private Double costPriceDesc;
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
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    /**
     * 截止时间
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    /**
     * 开奖时间
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
    private Integer limitCountMin = -1;
    /**
     * 最高参与人数   -1不限制
     */
    private Integer limitCountMax = -1;
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
