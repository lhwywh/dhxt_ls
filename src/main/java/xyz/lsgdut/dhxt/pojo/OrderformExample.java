package xyz.lsgdut.dhxt.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderformExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOderNumIsNull() {
            addCriterion("oder_num is null");
            return (Criteria) this;
        }

        public Criteria andOderNumIsNotNull() {
            addCriterion("oder_num is not null");
            return (Criteria) this;
        }

        public Criteria andOderNumEqualTo(Integer value) {
            addCriterion("oder_num =", value, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumNotEqualTo(Integer value) {
            addCriterion("oder_num <>", value, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumGreaterThan(Integer value) {
            addCriterion("oder_num >", value, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("oder_num >=", value, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumLessThan(Integer value) {
            addCriterion("oder_num <", value, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumLessThanOrEqualTo(Integer value) {
            addCriterion("oder_num <=", value, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumIn(List<Integer> values) {
            addCriterion("oder_num in", values, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumNotIn(List<Integer> values) {
            addCriterion("oder_num not in", values, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumBetween(Integer value1, Integer value2) {
            addCriterion("oder_num between", value1, value2, "oderNum");
            return (Criteria) this;
        }

        public Criteria andOderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("oder_num not between", value1, value2, "oderNum");
            return (Criteria) this;
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIsNull() {
            addCriterion("is_complete is null");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIsNotNull() {
            addCriterion("is_complete is not null");
            return (Criteria) this;
        }

        public Criteria andIsCompleteEqualTo(Integer value) {
            addCriterion("is_complete =", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotEqualTo(Integer value) {
            addCriterion("is_complete <>", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteGreaterThan(Integer value) {
            addCriterion("is_complete >", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_complete >=", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteLessThan(Integer value) {
            addCriterion("is_complete <", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_complete <=", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIn(List<Integer> values) {
            addCriterion("is_complete in", values, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotIn(List<Integer> values) {
            addCriterion("is_complete not in", values, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteBetween(Integer value1, Integer value2) {
            addCriterion("is_complete between", value1, value2, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_complete not between", value1, value2, "isComplete");
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