package com.yd.lottery.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class ClinUserSummary {
    private Long kid;

    private BigDecimal totalInvestAmount;

    private BigDecimal totalProfitAmount;

    private Integer totalCountClocked;

    private Integer totalCountJoined;

    private String nickname;

    private String iconUrl;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public BigDecimal getTotalInvestAmount() {
        return totalInvestAmount;
    }

    public void setTotalInvestAmount(BigDecimal totalInvestAmount) {
        this.totalInvestAmount = totalInvestAmount;
    }

    public BigDecimal getTotalProfitAmount() {
        return totalProfitAmount;
    }

    public void setTotalProfitAmount(BigDecimal totalProfitAmount) {
        this.totalProfitAmount = totalProfitAmount;
    }

    public Integer getTotalCountClocked() {
        return totalCountClocked;
    }

    public void setTotalCountClocked(Integer totalCountClocked) {
        this.totalCountClocked = totalCountClocked;
    }

    public Integer getTotalCountJoined() {
        return totalCountJoined;
    }

    public void setTotalCountJoined(Integer totalCountJoined) {
        this.totalCountJoined = totalCountJoined;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
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
        sb.append(", totalInvestAmount=").append(totalInvestAmount);
        sb.append(", totalProfitAmount=").append(totalProfitAmount);
        sb.append(", totalCountClocked=").append(totalCountClocked);
        sb.append(", totalCountJoined=").append(totalCountJoined);
        sb.append(", nickname=").append(nickname);
        sb.append(", iconUrl=").append(iconUrl);
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
        ClinUserSummary other = (ClinUserSummary) that;
        return (this.getKid() == null ? other.getKid() == null : this.getKid().equals(other.getKid()))
            && (this.getTotalInvestAmount() == null ? other.getTotalInvestAmount() == null : this.getTotalInvestAmount().equals(other.getTotalInvestAmount()))
            && (this.getTotalProfitAmount() == null ? other.getTotalProfitAmount() == null : this.getTotalProfitAmount().equals(other.getTotalProfitAmount()))
            && (this.getTotalCountClocked() == null ? other.getTotalCountClocked() == null : this.getTotalCountClocked().equals(other.getTotalCountClocked()))
            && (this.getTotalCountJoined() == null ? other.getTotalCountJoined() == null : this.getTotalCountJoined().equals(other.getTotalCountJoined()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getIconUrl() == null ? other.getIconUrl() == null : this.getIconUrl().equals(other.getIconUrl()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKid() == null) ? 0 : getKid().hashCode());
        result = prime * result + ((getTotalInvestAmount() == null) ? 0 : getTotalInvestAmount().hashCode());
        result = prime * result + ((getTotalProfitAmount() == null) ? 0 : getTotalProfitAmount().hashCode());
        result = prime * result + ((getTotalCountClocked() == null) ? 0 : getTotalCountClocked().hashCode());
        result = prime * result + ((getTotalCountJoined() == null) ? 0 : getTotalCountJoined().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    public enum Column {
        kid("kid", "kid", "BIGINT", false),
        totalInvestAmount("total_invest_amount", "totalInvestAmount", "DECIMAL", false),
        totalProfitAmount("total_profit_amount", "totalProfitAmount", "DECIMAL", false),
        totalCountClocked("total_count_clocked", "totalCountClocked", "INTEGER", false),
        totalCountJoined("total_count_joined", "totalCountJoined", "INTEGER", false),
        nickname("nickname", "nickname", "VARCHAR", false),
        iconUrl("icon_url", "iconUrl", "VARCHAR", false),
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