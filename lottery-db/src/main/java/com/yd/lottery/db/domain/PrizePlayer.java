package com.yd.lottery.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class PrizePlayer {
    private Long kid;

    private Long prizeKid;

    private Long userKid;

    private String userNickname;

    private String userIconUrl;

    private Integer boostCount;

    private Boolean isWinner;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String prizeName;

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public Long getPrizeKid() {
        return prizeKid;
    }

    public void setPrizeKid(Long prizeKid) {
        this.prizeKid = prizeKid;
    }

    public Long getUserKid() {
        return userKid;
    }

    public void setUserKid(Long userKid) {
        this.userKid = userKid;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserIconUrl() {
        return userIconUrl;
    }

    public void setUserIconUrl(String userIconUrl) {
        this.userIconUrl = userIconUrl;
    }

    public Integer getBoostCount() {
        return boostCount;
    }

    public void setBoostCount(Integer boostCount) {
        this.boostCount = boostCount;
    }

    public Boolean getIsWinner() {
        return isWinner;
    }

    public void setIsWinner(Boolean isWinner) {
        this.isWinner = isWinner;
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

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", kid=").append(kid);
        sb.append(", prizeKid=").append(prizeKid);
        sb.append(", userKid=").append(userKid);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userIconUrl=").append(userIconUrl);
        sb.append(", boostCount=").append(boostCount);
        sb.append(", isWinner=").append(isWinner);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", prizeName=").append(prizeName);
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
        PrizePlayer other = (PrizePlayer) that;
        return (this.getKid() == null ? other.getKid() == null : this.getKid().equals(other.getKid()))
            && (this.getPrizeKid() == null ? other.getPrizeKid() == null : this.getPrizeKid().equals(other.getPrizeKid()))
            && (this.getUserKid() == null ? other.getUserKid() == null : this.getUserKid().equals(other.getUserKid()))
            && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()))
            && (this.getUserIconUrl() == null ? other.getUserIconUrl() == null : this.getUserIconUrl().equals(other.getUserIconUrl()))
            && (this.getBoostCount() == null ? other.getBoostCount() == null : this.getBoostCount().equals(other.getBoostCount()))
            && (this.getIsWinner() == null ? other.getIsWinner() == null : this.getIsWinner().equals(other.getIsWinner()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getPrizeName() == null ? other.getPrizeName() == null : this.getPrizeName().equals(other.getPrizeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKid() == null) ? 0 : getKid().hashCode());
        result = prime * result + ((getPrizeKid() == null) ? 0 : getPrizeKid().hashCode());
        result = prime * result + ((getUserKid() == null) ? 0 : getUserKid().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        result = prime * result + ((getUserIconUrl() == null) ? 0 : getUserIconUrl().hashCode());
        result = prime * result + ((getBoostCount() == null) ? 0 : getBoostCount().hashCode());
        result = prime * result + ((getIsWinner() == null) ? 0 : getIsWinner().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getPrizeName() == null) ? 0 : getPrizeName().hashCode());
        return result;
    }

    public enum Column {
        kid("kid", "kid", "BIGINT", false),
        prizeKid("prize_kid", "prizeKid", "BIGINT", false),
        userKid("user_kid", "userKid", "BIGINT", false),
        userNickname("user_nickname", "userNickname", "VARCHAR", false),
        userIconUrl("user_icon_url", "userIconUrl", "VARCHAR", false),
        boostCount("boost_count", "boostCount", "INTEGER", false),
        isWinner("is_winner", "isWinner", "BIT", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        prizeName("prize_name", "prizeName", "VARCHAR", false);

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