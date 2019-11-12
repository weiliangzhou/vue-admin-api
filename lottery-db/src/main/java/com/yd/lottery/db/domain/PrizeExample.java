package com.yd.lottery.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrizeExample() {
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

    public PrizeExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public PrizeExample orderBy(String ... orderByClauses) {
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
        PrizeExample example = new PrizeExample();
        return example.createCriteria();
    }

    public PrizeExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public PrizeExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andKidEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("kid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Long value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("kid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Long value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("kid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Long value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("kid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Long value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("kid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Long value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualToColumn(Prize.Column column) {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`name` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`name` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`name` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`name` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`name` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`name` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Integer value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("market_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Integer value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("market_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Integer value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("market_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("market_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Integer value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("market_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Integer value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("market_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Integer> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Integer> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Integer value1, Integer value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Integer value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("cost_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Integer value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("cost_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Integer value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("cost_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("cost_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Integer value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("cost_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("cost_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Integer> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Integer> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andImgUrl1IsNull() {
            addCriterion("img_url_1 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl1IsNotNull() {
            addCriterion("img_url_1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl1EqualTo(String value) {
            addCriterion("img_url_1 =", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1EqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_1 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotEqualTo(String value) {
            addCriterion("img_url_1 <>", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_1 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl1GreaterThan(String value) {
            addCriterion("img_url_1 >", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1GreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_1 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("img_url_1 >=", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1GreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_1 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl1LessThan(String value) {
            addCriterion("img_url_1 <", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1LessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_1 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl1LessThanOrEqualTo(String value) {
            addCriterion("img_url_1 <=", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1LessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_1 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl1Like(String value) {
            addCriterion("img_url_1 like", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotLike(String value) {
            addCriterion("img_url_1 not like", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1In(List<String> values) {
            addCriterion("img_url_1 in", values, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotIn(List<String> values) {
            addCriterion("img_url_1 not in", values, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1Between(String value1, String value2) {
            addCriterion("img_url_1 between", value1, value2, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotBetween(String value1, String value2) {
            addCriterion("img_url_1 not between", value1, value2, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl2IsNull() {
            addCriterion("img_url_2 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl2IsNotNull() {
            addCriterion("img_url_2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl2EqualTo(String value) {
            addCriterion("img_url_2 =", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2EqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_2 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotEqualTo(String value) {
            addCriterion("img_url_2 <>", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_2 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThan(String value) {
            addCriterion("img_url_2 >", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_2 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("img_url_2 >=", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_2 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThan(String value) {
            addCriterion("img_url_2 <", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_2 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThanOrEqualTo(String value) {
            addCriterion("img_url_2 <=", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_2 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl2Like(String value) {
            addCriterion("img_url_2 like", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotLike(String value) {
            addCriterion("img_url_2 not like", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2In(List<String> values) {
            addCriterion("img_url_2 in", values, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotIn(List<String> values) {
            addCriterion("img_url_2 not in", values, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2Between(String value1, String value2) {
            addCriterion("img_url_2 between", value1, value2, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotBetween(String value1, String value2) {
            addCriterion("img_url_2 not between", value1, value2, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl3IsNull() {
            addCriterion("img_url_3 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl3IsNotNull() {
            addCriterion("img_url_3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl3EqualTo(String value) {
            addCriterion("img_url_3 =", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3EqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_3 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotEqualTo(String value) {
            addCriterion("img_url_3 <>", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_3 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl3GreaterThan(String value) {
            addCriterion("img_url_3 >", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3GreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_3 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl3GreaterThanOrEqualTo(String value) {
            addCriterion("img_url_3 >=", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3GreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_3 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl3LessThan(String value) {
            addCriterion("img_url_3 <", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3LessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_3 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl3LessThanOrEqualTo(String value) {
            addCriterion("img_url_3 <=", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3LessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("img_url_3 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andImgUrl3Like(String value) {
            addCriterion("img_url_3 like", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotLike(String value) {
            addCriterion("img_url_3 not like", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3In(List<String> values) {
            addCriterion("img_url_3 in", values, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotIn(List<String> values) {
            addCriterion("img_url_3 not in", values, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3Between(String value1, String value2) {
            addCriterion("img_url_3 between", value1, value2, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotBetween(String value1, String value2) {
            addCriterion("img_url_3 not between", value1, value2, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("video_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("video_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("video_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("video_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("video_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("video_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("`desc` is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("`desc` is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("`desc` =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`desc` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("`desc` <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`desc` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("`desc` >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`desc` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("`desc` >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`desc` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("`desc` <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`desc` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("`desc` <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("`desc` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("`desc` like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("`desc` not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("`desc` in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("`desc` not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("`desc` between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("`desc` not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDrawStateIsNull() {
            addCriterion("draw_state is null");
            return (Criteria) this;
        }

        public Criteria andDrawStateIsNotNull() {
            addCriterion("draw_state is not null");
            return (Criteria) this;
        }

        public Criteria andDrawStateEqualTo(Integer value) {
            addCriterion("draw_state =", value, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_state = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawStateNotEqualTo(Integer value) {
            addCriterion("draw_state <>", value, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_state <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawStateGreaterThan(Integer value) {
            addCriterion("draw_state >", value, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_state > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("draw_state >=", value, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_state >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawStateLessThan(Integer value) {
            addCriterion("draw_state <", value, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_state < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawStateLessThanOrEqualTo(Integer value) {
            addCriterion("draw_state <=", value, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_state <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawStateIn(List<Integer> values) {
            addCriterion("draw_state in", values, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateNotIn(List<Integer> values) {
            addCriterion("draw_state not in", values, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateBetween(Integer value1, Integer value2) {
            addCriterion("draw_state between", value1, value2, "drawState");
            return (Criteria) this;
        }

        public Criteria andDrawStateNotBetween(Integer value1, Integer value2) {
            addCriterion("draw_state not between", value1, value2, "drawState");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(LocalDateTime value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("start_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(LocalDateTime value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("start_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(LocalDateTime value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("start_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("start_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(LocalDateTime value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("start_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("start_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<LocalDateTime> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<LocalDateTime> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(LocalDateTime value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(LocalDateTime value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(LocalDateTime value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(LocalDateTime value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<LocalDateTime> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<LocalDateTime> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeIsNull() {
            addCriterion("draw_time is null");
            return (Criteria) this;
        }

        public Criteria andDrawTimeIsNotNull() {
            addCriterion("draw_time is not null");
            return (Criteria) this;
        }

        public Criteria andDrawTimeEqualTo(LocalDateTime value) {
            addCriterion("draw_time =", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawTimeNotEqualTo(LocalDateTime value) {
            addCriterion("draw_time <>", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawTimeGreaterThan(LocalDateTime value) {
            addCriterion("draw_time >", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("draw_time >=", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawTimeLessThan(LocalDateTime value) {
            addCriterion("draw_time <", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("draw_time <=", value, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("draw_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDrawTimeIn(List<LocalDateTime> values) {
            addCriterion("draw_time in", values, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeNotIn(List<LocalDateTime> values) {
            addCriterion("draw_time not in", values, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("draw_time between", value1, value2, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDrawTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("draw_time not between", value1, value2, "drawTime");
            return (Criteria) this;
        }

        public Criteria andDisplayStateIsNull() {
            addCriterion("display_state is null");
            return (Criteria) this;
        }

        public Criteria andDisplayStateIsNotNull() {
            addCriterion("display_state is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayStateEqualTo(Integer value) {
            addCriterion("display_state =", value, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("display_state = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDisplayStateNotEqualTo(Integer value) {
            addCriterion("display_state <>", value, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("display_state <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDisplayStateGreaterThan(Integer value) {
            addCriterion("display_state >", value, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("display_state > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDisplayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_state >=", value, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("display_state >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDisplayStateLessThan(Integer value) {
            addCriterion("display_state <", value, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("display_state < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDisplayStateLessThanOrEqualTo(Integer value) {
            addCriterion("display_state <=", value, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("display_state <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDisplayStateIn(List<Integer> values) {
            addCriterion("display_state in", values, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateNotIn(List<Integer> values) {
            addCriterion("display_state not in", values, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateBetween(Integer value1, Integer value2) {
            addCriterion("display_state between", value1, value2, "displayState");
            return (Criteria) this;
        }

        public Criteria andDisplayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("display_state not between", value1, value2, "displayState");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinIsNull() {
            addCriterion("limit_count_min is null");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinIsNotNull() {
            addCriterion("limit_count_min is not null");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinEqualTo(Integer value) {
            addCriterion("limit_count_min =", value, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_min = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMinNotEqualTo(Integer value) {
            addCriterion("limit_count_min <>", value, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_min <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMinGreaterThan(Integer value) {
            addCriterion("limit_count_min >", value, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_min > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_count_min >=", value, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_min >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMinLessThan(Integer value) {
            addCriterion("limit_count_min <", value, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_min < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMinLessThanOrEqualTo(Integer value) {
            addCriterion("limit_count_min <=", value, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_min <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMinIn(List<Integer> values) {
            addCriterion("limit_count_min in", values, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinNotIn(List<Integer> values) {
            addCriterion("limit_count_min not in", values, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinBetween(Integer value1, Integer value2) {
            addCriterion("limit_count_min between", value1, value2, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMinNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_count_min not between", value1, value2, "limitCountMin");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxIsNull() {
            addCriterion("limit_count_max is null");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxIsNotNull() {
            addCriterion("limit_count_max is not null");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxEqualTo(Integer value) {
            addCriterion("limit_count_max =", value, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_max = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxNotEqualTo(Integer value) {
            addCriterion("limit_count_max <>", value, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_max <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxGreaterThan(Integer value) {
            addCriterion("limit_count_max >", value, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_max > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_count_max >=", value, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_max >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxLessThan(Integer value) {
            addCriterion("limit_count_max <", value, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_max < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxLessThanOrEqualTo(Integer value) {
            addCriterion("limit_count_max <=", value, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_count_max <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxIn(List<Integer> values) {
            addCriterion("limit_count_max in", values, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxNotIn(List<Integer> values) {
            addCriterion("limit_count_max not in", values, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxBetween(Integer value1, Integer value2) {
            addCriterion("limit_count_max between", value1, value2, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitCountMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_count_max not between", value1, value2, "limitCountMax");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNull() {
            addCriterion("limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNotNull() {
            addCriterion("limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualTo(Integer value) {
            addCriterion("limit_type =", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualTo(Integer value) {
            addCriterion("limit_type <>", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThan(Integer value) {
            addCriterion("limit_type >", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_type >=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThan(Integer value) {
            addCriterion("limit_type <", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("limit_type <=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("limit_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTypeIn(List<Integer> values) {
            addCriterion("limit_type in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotIn(List<Integer> values) {
            addCriterion("limit_type not in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeBetween(Integer value1, Integer value2) {
            addCriterion("limit_type between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_type not between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(Integer value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("activity_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(Integer value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("activity_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(Integer value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("activity_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("activity_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(Integer value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("activity_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("activity_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<Integer> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<Integer> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(Integer value1, Integer value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andPlayerCountIsNull() {
            addCriterion("player_count is null");
            return (Criteria) this;
        }

        public Criteria andPlayerCountIsNotNull() {
            addCriterion("player_count is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerCountEqualTo(Integer value) {
            addCriterion("player_count =", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountNotEqualTo(Integer value) {
            addCriterion("player_count <>", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountGreaterThan(Integer value) {
            addCriterion("player_count >", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("player_count >=", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountLessThan(Integer value) {
            addCriterion("player_count <", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountLessThanOrEqualTo(Integer value) {
            addCriterion("player_count <=", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountIn(List<Integer> values) {
            addCriterion("player_count in", values, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountNotIn(List<Integer> values) {
            addCriterion("player_count not in", values, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountBetween(Integer value1, Integer value2) {
            addCriterion("player_count between", value1, value2, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("player_count not between", value1, value2, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitIsNull() {
            addCriterion("player_count_init is null");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitIsNotNull() {
            addCriterion("player_count_init is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitEqualTo(Integer value) {
            addCriterion("player_count_init =", value, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count_init = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitNotEqualTo(Integer value) {
            addCriterion("player_count_init <>", value, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count_init <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitGreaterThan(Integer value) {
            addCriterion("player_count_init >", value, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count_init > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitGreaterThanOrEqualTo(Integer value) {
            addCriterion("player_count_init >=", value, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count_init >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitLessThan(Integer value) {
            addCriterion("player_count_init <", value, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count_init < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitLessThanOrEqualTo(Integer value) {
            addCriterion("player_count_init <=", value, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitLessThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("player_count_init <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitIn(List<Integer> values) {
            addCriterion("player_count_init in", values, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitNotIn(List<Integer> values) {
            addCriterion("player_count_init not in", values, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitBetween(Integer value1, Integer value2) {
            addCriterion("player_count_init between", value1, value2, "playerCountInit");
            return (Criteria) this;
        }

        public Criteria andPlayerCountInitNotBetween(Integer value1, Integer value2) {
            addCriterion("player_count_init not between", value1, value2, "playerCountInit");
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

        public Criteria andCreateTimeEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(Prize.Column column) {
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

        public Criteria andUpdateTimeEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(Prize.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(Prize.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(Prize.Column column) {
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
        private PrizeExample example;

        protected Criteria(PrizeExample example) {
            super();
            this.example = example;
        }

        public PrizeExample example() {
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
        void example(com.yd.lottery.db.domain.PrizeExample example);
    }
}