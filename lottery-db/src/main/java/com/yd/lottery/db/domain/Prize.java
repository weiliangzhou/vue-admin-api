package com.yd.lottery.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Prize {
    private Long kid;

    private String name;

    private Integer marketPrice;

    private Integer costPrice;

    private String imgUrl1;

    private String imgUrl2;

    private String imgUrl3;

    private String videoUrl;

    private String desc;

    private Integer drawState;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private LocalDateTime drawTime;

    private Integer displayState;

    private Integer limitCountMin;

    private Integer limitCountMax;

    private Integer limitType;

    private Integer activityType;

    private Integer playerCount;

    private Integer playerCountInit;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getImgUrl1() {
        return imgUrl1;
    }

    public void setImgUrl1(String imgUrl1) {
        this.imgUrl1 = imgUrl1;
    }

    public String getImgUrl2() {
        return imgUrl2;
    }

    public void setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2;
    }

    public String getImgUrl3() {
        return imgUrl3;
    }

    public void setImgUrl3(String imgUrl3) {
        this.imgUrl3 = imgUrl3;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getDrawState() {
        return drawState;
    }

    public void setDrawState(Integer drawState) {
        this.drawState = drawState;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(LocalDateTime drawTime) {
        this.drawTime = drawTime;
    }

    public Integer getDisplayState() {
        return displayState;
    }

    public void setDisplayState(Integer displayState) {
        this.displayState = displayState;
    }

    public Integer getLimitCountMin() {
        return limitCountMin;
    }

    public void setLimitCountMin(Integer limitCountMin) {
        this.limitCountMin = limitCountMin;
    }

    public Integer getLimitCountMax() {
        return limitCountMax;
    }

    public void setLimitCountMax(Integer limitCountMax) {
        this.limitCountMax = limitCountMax;
    }

    public Integer getLimitType() {
        return limitType;
    }

    public void setLimitType(Integer limitType) {
        this.limitType = limitType;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(Integer playerCount) {
        this.playerCount = playerCount;
    }

    public Integer getPlayerCountInit() {
        return playerCountInit;
    }

    public void setPlayerCountInit(Integer playerCountInit) {
        this.playerCountInit = playerCountInit;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", kid=").append(kid);
        sb.append(", name=").append(name);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", imgUrl1=").append(imgUrl1);
        sb.append(", imgUrl2=").append(imgUrl2);
        sb.append(", imgUrl3=").append(imgUrl3);
        sb.append(", videoUrl=").append(videoUrl);
        sb.append(", desc=").append(desc);
        sb.append(", drawState=").append(drawState);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", drawTime=").append(drawTime);
        sb.append(", displayState=").append(displayState);
        sb.append(", limitCountMin=").append(limitCountMin);
        sb.append(", limitCountMax=").append(limitCountMax);
        sb.append(", limitType=").append(limitType);
        sb.append(", activityType=").append(activityType);
        sb.append(", playerCount=").append(playerCount);
        sb.append(", playerCountInit=").append(playerCountInit);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Prize other = (Prize) that;
        return (this.getKid() == null ? other.getKid() == null : this.getKid().equals(other.getKid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getImgUrl1() == null ? other.getImgUrl1() == null : this.getImgUrl1().equals(other.getImgUrl1()))
            && (this.getImgUrl2() == null ? other.getImgUrl2() == null : this.getImgUrl2().equals(other.getImgUrl2()))
            && (this.getImgUrl3() == null ? other.getImgUrl3() == null : this.getImgUrl3().equals(other.getImgUrl3()))
            && (this.getVideoUrl() == null ? other.getVideoUrl() == null : this.getVideoUrl().equals(other.getVideoUrl()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getDrawState() == null ? other.getDrawState() == null : this.getDrawState().equals(other.getDrawState()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getDrawTime() == null ? other.getDrawTime() == null : this.getDrawTime().equals(other.getDrawTime()))
            && (this.getDisplayState() == null ? other.getDisplayState() == null : this.getDisplayState().equals(other.getDisplayState()))
            && (this.getLimitCountMin() == null ? other.getLimitCountMin() == null : this.getLimitCountMin().equals(other.getLimitCountMin()))
            && (this.getLimitCountMax() == null ? other.getLimitCountMax() == null : this.getLimitCountMax().equals(other.getLimitCountMax()))
            && (this.getLimitType() == null ? other.getLimitType() == null : this.getLimitType().equals(other.getLimitType()))
            && (this.getActivityType() == null ? other.getActivityType() == null : this.getActivityType().equals(other.getActivityType()))
            && (this.getPlayerCount() == null ? other.getPlayerCount() == null : this.getPlayerCount().equals(other.getPlayerCount()))
            && (this.getPlayerCountInit() == null ? other.getPlayerCountInit() == null : this.getPlayerCountInit().equals(other.getPlayerCountInit()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKid() == null) ? 0 : getKid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getImgUrl1() == null) ? 0 : getImgUrl1().hashCode());
        result = prime * result + ((getImgUrl2() == null) ? 0 : getImgUrl2().hashCode());
        result = prime * result + ((getImgUrl3() == null) ? 0 : getImgUrl3().hashCode());
        result = prime * result + ((getVideoUrl() == null) ? 0 : getVideoUrl().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getDrawState() == null) ? 0 : getDrawState().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getDrawTime() == null) ? 0 : getDrawTime().hashCode());
        result = prime * result + ((getDisplayState() == null) ? 0 : getDisplayState().hashCode());
        result = prime * result + ((getLimitCountMin() == null) ? 0 : getLimitCountMin().hashCode());
        result = prime * result + ((getLimitCountMax() == null) ? 0 : getLimitCountMax().hashCode());
        result = prime * result + ((getLimitType() == null) ? 0 : getLimitType().hashCode());
        result = prime * result + ((getActivityType() == null) ? 0 : getActivityType().hashCode());
        result = prime * result + ((getPlayerCount() == null) ? 0 : getPlayerCount().hashCode());
        result = prime * result + ((getPlayerCountInit() == null) ? 0 : getPlayerCountInit().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    public enum Column {
        kid("kid", "kid", "BIGINT", false),
        name("name", "name", "VARCHAR", true),
        marketPrice("market_price", "marketPrice", "INTEGER", false),
        costPrice("cost_price", "costPrice", "INTEGER", false),
        imgUrl1("img_url_1", "imgUrl1", "VARCHAR", false),
        imgUrl2("img_url_2", "imgUrl2", "VARCHAR", false),
        imgUrl3("img_url_3", "imgUrl3", "VARCHAR", false),
        videoUrl("video_url", "videoUrl", "VARCHAR", false),
        desc("desc", "desc", "VARCHAR", true),
        drawState("draw_state", "drawState", "INTEGER", false),
        startTime("start_time", "startTime", "TIMESTAMP", false),
        endTime("end_time", "endTime", "TIMESTAMP", false),
        drawTime("draw_time", "drawTime", "TIMESTAMP", false),
        displayState("display_state", "displayState", "INTEGER", false),
        limitCountMin("limit_count_min", "limitCountMin", "INTEGER", false),
        limitCountMax("limit_count_max", "limitCountMax", "INTEGER", false),
        limitType("limit_type", "limitType", "INTEGER", false),
        activityType("activity_type", "activityType", "INTEGER", false),
        playerCount("player_count", "playerCount", "INTEGER", false),
        playerCountInit("player_count_init", "playerCountInit", "INTEGER", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}