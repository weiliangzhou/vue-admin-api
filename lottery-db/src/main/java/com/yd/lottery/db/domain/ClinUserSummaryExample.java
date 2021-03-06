package com.yd.lottery.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClinUserSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClinUserSummaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public ClinUserSummaryExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ClinUserSummaryExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        ClinUserSummaryExample example = new ClinUserSummaryExample();
        return example.createCriteria();
    }

    public ClinUserSummaryExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ClinUserSummaryExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andKidIsNull() {
            addCriterion("kid is null");
            return (Criteria) this;
        }

        public Criteria andKidIsNotNull() {
            addCriterion("kid is not null");
            return (Criteria) this;
        }

        public Criteria andKidEqualTo(Long value) {
            addCriterion("kid =", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("kid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Long value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("kid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Long value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("kid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Long value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("kid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Long value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("kid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Long value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("kid <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidIn(List<Long> values) {
            addCriterion("kid in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotIn(List<Long> values) {
            addCriterion("kid not in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidBetween(Long value1, Long value2) {
            addCriterion("kid between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotBetween(Long value1, Long value2) {
            addCriterion("kid not between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountIsNull() {
            addCriterion("total_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountIsNotNull() {
            addCriterion("total_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountEqualTo(BigDecimal value) {
            addCriterion("total_invest_amount =", value, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_invest_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_invest_amount <>", value, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_invest_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountGreaterThan(BigDecimal value) {
            addCriterion("total_invest_amount >", value, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_invest_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_invest_amount >=", value, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_invest_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountLessThan(BigDecimal value) {
            addCriterion("total_invest_amount <", value, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_invest_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_invest_amount <=", value, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_invest_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountIn(List<BigDecimal> values) {
            addCriterion("total_invest_amount in", values, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_invest_amount not in", values, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_invest_amount between", value1, value2, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalInvestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_invest_amount not between", value1, value2, "totalInvestAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountIsNull() {
            addCriterion("total_profit_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountIsNotNull() {
            addCriterion("total_profit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountEqualTo(BigDecimal value) {
            addCriterion("total_profit_amount =", value, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_profit_amount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_profit_amount <>", value, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_profit_amount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountGreaterThan(BigDecimal value) {
            addCriterion("total_profit_amount >", value, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_profit_amount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_profit_amount >=", value, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_profit_amount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountLessThan(BigDecimal value) {
            addCriterion("total_profit_amount <", value, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_profit_amount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_profit_amount <=", value, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_profit_amount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountIn(List<BigDecimal> values) {
            addCriterion("total_profit_amount in", values, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_profit_amount not in", values, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_profit_amount between", value1, value2, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalProfitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_profit_amount not between", value1, value2, "totalProfitAmount");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedIsNull() {
            addCriterion("total_count_clocked is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedIsNotNull() {
            addCriterion("total_count_clocked is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedEqualTo(Integer value) {
            addCriterion("total_count_clocked =", value, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_clocked = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedNotEqualTo(Integer value) {
            addCriterion("total_count_clocked <>", value, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_clocked <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedGreaterThan(Integer value) {
            addCriterion("total_count_clocked >", value, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_clocked > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count_clocked >=", value, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_clocked >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedLessThan(Integer value) {
            addCriterion("total_count_clocked <", value, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_clocked < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedLessThanOrEqualTo(Integer value) {
            addCriterion("total_count_clocked <=", value, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_clocked <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedIn(List<Integer> values) {
            addCriterion("total_count_clocked in", values, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedNotIn(List<Integer> values) {
            addCriterion("total_count_clocked not in", values, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedBetween(Integer value1, Integer value2) {
            addCriterion("total_count_clocked between", value1, value2, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountClockedNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count_clocked not between", value1, value2, "totalCountClocked");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedIsNull() {
            addCriterion("total_count_joined is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedIsNotNull() {
            addCriterion("total_count_joined is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedEqualTo(Integer value) {
            addCriterion("total_count_joined =", value, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_joined = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedNotEqualTo(Integer value) {
            addCriterion("total_count_joined <>", value, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_joined <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedGreaterThan(Integer value) {
            addCriterion("total_count_joined >", value, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_joined > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_count_joined >=", value, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_joined >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedLessThan(Integer value) {
            addCriterion("total_count_joined <", value, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_joined < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedLessThanOrEqualTo(Integer value) {
            addCriterion("total_count_joined <=", value, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("total_count_joined <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedIn(List<Integer> values) {
            addCriterion("total_count_joined in", values, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedNotIn(List<Integer> values) {
            addCriterion("total_count_joined not in", values, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedBetween(Integer value1, Integer value2) {
            addCriterion("total_count_joined between", value1, value2, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andTotalCountJoinedNotBetween(Integer value1, Integer value2) {
            addCriterion("total_count_joined not between", value1, value2, "totalCountJoined");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("nickname = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("nickname <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("nickname > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("nickname >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("nickname < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("nickname <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("icon_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("icon_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("icon_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("icon_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("icon_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("icon_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("create_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(ClinUserSummary.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ClinUserSummaryExample example;

        protected Criteria(ClinUserSummaryExample example) {
            super();
            this.example = example;
        }

        public ClinUserSummaryExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.yd.lottery.db.domain.ClinUserSummaryExample example);
    }
}