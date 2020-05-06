package xyz.lsgdut.dhxt.pojo;

import java.util.ArrayList;
import java.util.List;

public class PartinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartinfoExample() {
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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

        public Criteria andPartIdIsNull() {
            addCriterion("part_id is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("part_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(Integer value) {
            addCriterion("part_id =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(Integer value) {
            addCriterion("part_id <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(Integer value) {
            addCriterion("part_id >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_id >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(Integer value) {
            addCriterion("part_id <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(Integer value) {
            addCriterion("part_id <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<Integer> values) {
            addCriterion("part_id in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<Integer> values) {
            addCriterion("part_id not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(Integer value1, Integer value2) {
            addCriterion("part_id between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("part_id not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartPriceIsNull() {
            addCriterion("part_price is null");
            return (Criteria) this;
        }

        public Criteria andPartPriceIsNotNull() {
            addCriterion("part_price is not null");
            return (Criteria) this;
        }

        public Criteria andPartPriceEqualTo(Float value) {
            addCriterion("part_price =", value, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceNotEqualTo(Float value) {
            addCriterion("part_price <>", value, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceGreaterThan(Float value) {
            addCriterion("part_price >", value, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("part_price >=", value, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceLessThan(Float value) {
            addCriterion("part_price <", value, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceLessThanOrEqualTo(Float value) {
            addCriterion("part_price <=", value, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceIn(List<Float> values) {
            addCriterion("part_price in", values, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceNotIn(List<Float> values) {
            addCriterion("part_price not in", values, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceBetween(Float value1, Float value2) {
            addCriterion("part_price between", value1, value2, "partPrice");
            return (Criteria) this;
        }

        public Criteria andPartPriceNotBetween(Float value1, Float value2) {
            addCriterion("part_price not between", value1, value2, "partPrice");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdIsNull() {
            addCriterion("main_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdIsNotNull() {
            addCriterion("main_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdEqualTo(Integer value) {
            addCriterion("main_supplier_id =", value, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdNotEqualTo(Integer value) {
            addCriterion("main_supplier_id <>", value, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdGreaterThan(Integer value) {
            addCriterion("main_supplier_id >", value, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_supplier_id >=", value, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdLessThan(Integer value) {
            addCriterion("main_supplier_id <", value, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("main_supplier_id <=", value, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdIn(List<Integer> values) {
            addCriterion("main_supplier_id in", values, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdNotIn(List<Integer> values) {
            addCriterion("main_supplier_id not in", values, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("main_supplier_id between", value1, value2, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andMainSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("main_supplier_id not between", value1, value2, "mainSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdIsNull() {
            addCriterion("sec_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdIsNotNull() {
            addCriterion("sec_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdEqualTo(Integer value) {
            addCriterion("sec_supplier_id =", value, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdNotEqualTo(Integer value) {
            addCriterion("sec_supplier_id <>", value, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdGreaterThan(Integer value) {
            addCriterion("sec_supplier_id >", value, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sec_supplier_id >=", value, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdLessThan(Integer value) {
            addCriterion("sec_supplier_id <", value, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("sec_supplier_id <=", value, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdIn(List<Integer> values) {
            addCriterion("sec_supplier_id in", values, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdNotIn(List<Integer> values) {
            addCriterion("sec_supplier_id not in", values, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("sec_supplier_id between", value1, value2, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andSecSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sec_supplier_id not between", value1, value2, "secSupplierId");
            return (Criteria) this;
        }

        public Criteria andPartNumIsNull() {
            addCriterion("part_num is null");
            return (Criteria) this;
        }

        public Criteria andPartNumIsNotNull() {
            addCriterion("part_num is not null");
            return (Criteria) this;
        }

        public Criteria andPartNumEqualTo(Integer value) {
            addCriterion("part_num =", value, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumNotEqualTo(Integer value) {
            addCriterion("part_num <>", value, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumGreaterThan(Integer value) {
            addCriterion("part_num >", value, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_num >=", value, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumLessThan(Integer value) {
            addCriterion("part_num <", value, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumLessThanOrEqualTo(Integer value) {
            addCriterion("part_num <=", value, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumIn(List<Integer> values) {
            addCriterion("part_num in", values, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumNotIn(List<Integer> values) {
            addCriterion("part_num not in", values, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumBetween(Integer value1, Integer value2) {
            addCriterion("part_num between", value1, value2, "partNum");
            return (Criteria) this;
        }

        public Criteria andPartNumNotBetween(Integer value1, Integer value2) {
            addCriterion("part_num not between", value1, value2, "partNum");
            return (Criteria) this;
        }

        public Criteria andCriticalValueIsNull() {
            addCriterion("critical_value is null");
            return (Criteria) this;
        }

        public Criteria andCriticalValueIsNotNull() {
            addCriterion("critical_value is not null");
            return (Criteria) this;
        }

        public Criteria andCriticalValueEqualTo(String value) {
            addCriterion("critical_value =", value, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueNotEqualTo(String value) {
            addCriterion("critical_value <>", value, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueGreaterThan(String value) {
            addCriterion("critical_value >", value, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueGreaterThanOrEqualTo(String value) {
            addCriterion("critical_value >=", value, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueLessThan(String value) {
            addCriterion("critical_value <", value, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueLessThanOrEqualTo(String value) {
            addCriterion("critical_value <=", value, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueLike(String value) {
            addCriterion("critical_value like", value, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueNotLike(String value) {
            addCriterion("critical_value not like", value, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueIn(List<String> values) {
            addCriterion("critical_value in", values, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueNotIn(List<String> values) {
            addCriterion("critical_value not in", values, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueBetween(String value1, String value2) {
            addCriterion("critical_value between", value1, value2, "criticalValue");
            return (Criteria) this;
        }

        public Criteria andCriticalValueNotBetween(String value1, String value2) {
            addCriterion("critical_value not between", value1, value2, "criticalValue");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}