package com.yd.lottery.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PrizePlayerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrizePlayerExample() {
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

    public PrizePlayerExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public PrizePlayerExample orderBy(String ... orderByClauses) {
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
        PrizePlayerExample example = new PrizePlayerExample();
        return example.createCriteria();
    }

    public PrizePlayerExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public PrizePlayerExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andKidEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("kid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Long value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("kid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Long value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("kid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Long value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("kid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Long value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("kid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Long value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualToColumn(PrizePlayer.Column column) {
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

        public Criteria andPrizeKidIsNull() {
            addCriterion("prize_kid is null");
            return (Criteria) this;
        }

        public Criteria andPrizeKidIsNotNull() {
            addCriterion("prize_kid is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeKidEqualTo(Long value) {
            addCriterion("prize_kid =", value, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_kid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeKidNotEqualTo(Long value) {
            addCriterion("prize_kid <>", value, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_kid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeKidGreaterThan(Long value) {
            addCriterion("prize_kid >", value, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_kid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeKidGreaterThanOrEqualTo(Long value) {
            addCriterion("prize_kid >=", value, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_kid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeKidLessThan(Long value) {
            addCriterion("prize_kid <", value, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_kid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeKidLessThanOrEqualTo(Long value) {
            addCriterion("prize_kid <=", value, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidLessThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_kid <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeKidIn(List<Long> values) {
            addCriterion("prize_kid in", values, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidNotIn(List<Long> values) {
            addCriterion("prize_kid not in", values, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidBetween(Long value1, Long value2) {
            addCriterion("prize_kid between", value1, value2, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andPrizeKidNotBetween(Long value1, Long value2) {
            addCriterion("prize_kid not between", value1, value2, "prizeKid");
            return (Criteria) this;
        }

        public Criteria andUserKidIsNull() {
            addCriterion("user_kid is null");
            return (Criteria) this;
        }

        public Criteria andUserKidIsNotNull() {
            addCriterion("user_kid is not null");
            return (Criteria) this;
        }

        public Criteria andUserKidEqualTo(Long value) {
            addCriterion("user_kid =", value, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_kid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserKidNotEqualTo(Long value) {
            addCriterion("user_kid <>", value, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_kid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserKidGreaterThan(Long value) {
            addCriterion("user_kid >", value, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_kid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserKidGreaterThanOrEqualTo(Long value) {
            addCriterion("user_kid >=", value, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_kid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserKidLessThan(Long value) {
            addCriterion("user_kid <", value, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_kid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserKidLessThanOrEqualTo(Long value) {
            addCriterion("user_kid <=", value, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidLessThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_kid <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserKidIn(List<Long> values) {
            addCriterion("user_kid in", values, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidNotIn(List<Long> values) {
            addCriterion("user_kid not in", values, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidBetween(Long value1, Long value2) {
            addCriterion("user_kid between", value1, value2, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserKidNotBetween(Long value1, Long value2) {
            addCriterion("user_kid not between", value1, value2, "userKid");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_nickname = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_nickname <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_nickname > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_nickname >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_nickname < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_nickname <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlIsNull() {
            addCriterion("user_icon_url is null");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlIsNotNull() {
            addCriterion("user_icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlEqualTo(String value) {
            addCriterion("user_icon_url =", value, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_icon_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIconUrlNotEqualTo(String value) {
            addCriterion("user_icon_url <>", value, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_icon_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIconUrlGreaterThan(String value) {
            addCriterion("user_icon_url >", value, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_icon_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_icon_url >=", value, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_icon_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIconUrlLessThan(String value) {
            addCriterion("user_icon_url <", value, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_icon_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIconUrlLessThanOrEqualTo(String value) {
            addCriterion("user_icon_url <=", value, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlLessThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("user_icon_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIconUrlLike(String value) {
            addCriterion("user_icon_url like", value, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlNotLike(String value) {
            addCriterion("user_icon_url not like", value, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlIn(List<String> values) {
            addCriterion("user_icon_url in", values, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlNotIn(List<String> values) {
            addCriterion("user_icon_url not in", values, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlBetween(String value1, String value2) {
            addCriterion("user_icon_url between", value1, value2, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andUserIconUrlNotBetween(String value1, String value2) {
            addCriterion("user_icon_url not between", value1, value2, "userIconUrl");
            return (Criteria) this;
        }

        public Criteria andBoostCountIsNull() {
            addCriterion("boost_count is null");
            return (Criteria) this;
        }

        public Criteria andBoostCountIsNotNull() {
            addCriterion("boost_count is not null");
            return (Criteria) this;
        }

        public Criteria andBoostCountEqualTo(Integer value) {
            addCriterion("boost_count =", value, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("boost_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBoostCountNotEqualTo(Integer value) {
            addCriterion("boost_count <>", value, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("boost_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBoostCountGreaterThan(Integer value) {
            addCriterion("boost_count >", value, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("boost_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBoostCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("boost_count >=", value, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("boost_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBoostCountLessThan(Integer value) {
            addCriterion("boost_count <", value, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("boost_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBoostCountLessThanOrEqualTo(Integer value) {
            addCriterion("boost_count <=", value, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountLessThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("boost_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBoostCountIn(List<Integer> values) {
            addCriterion("boost_count in", values, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountNotIn(List<Integer> values) {
            addCriterion("boost_count not in", values, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountBetween(Integer value1, Integer value2) {
            addCriterion("boost_count between", value1, value2, "boostCount");
            return (Criteria) this;
        }

        public Criteria andBoostCountNotBetween(Integer value1, Integer value2) {
            addCriterion("boost_count not between", value1, value2, "boostCount");
            return (Criteria) this;
        }

        public Criteria andIsWinnerIsNull() {
            addCriterion("is_winner is null");
            return (Criteria) this;
        }

        public Criteria andIsWinnerIsNotNull() {
            addCriterion("is_winner is not null");
            return (Criteria) this;
        }

        public Criteria andIsWinnerEqualTo(Boolean value) {
            addCriterion("is_winner =", value, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("is_winner = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsWinnerNotEqualTo(Boolean value) {
            addCriterion("is_winner <>", value, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("is_winner <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsWinnerGreaterThan(Boolean value) {
            addCriterion("is_winner >", value, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("is_winner > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsWinnerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_winner >=", value, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("is_winner >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsWinnerLessThan(Boolean value) {
            addCriterion("is_winner <", value, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("is_winner < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsWinnerLessThanOrEqualTo(Boolean value) {
            addCriterion("is_winner <=", value, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerLessThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("is_winner <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsWinnerIn(List<Boolean> values) {
            addCriterion("is_winner in", values, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerNotIn(List<Boolean> values) {
            addCriterion("is_winner not in", values, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerBetween(Boolean value1, Boolean value2) {
            addCriterion("is_winner between", value1, value2, "isWinner");
            return (Criteria) this;
        }

        public Criteria andIsWinnerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_winner not between", value1, value2, "isWinner");
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

        public Criteria andCreateTimeEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(PrizePlayer.Column column) {
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

        public Criteria andUpdateTimeEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(PrizePlayer.Column column) {
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

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualToColumn(PrizePlayer.Column column) {
            addCriterion(new StringBuilder("prize_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private PrizePlayerExample example;

        protected Criteria(PrizePlayerExample example) {
            super();
            this.example = example;
        }

        public PrizePlayerExample example() {
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
        void example(com.yd.lottery.db.domain.PrizePlayerExample example);
    }
}