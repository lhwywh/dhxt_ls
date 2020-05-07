package xyz.lsgdut.dhxt.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer oderNum;

    private Integer partId;

    private Integer mainSupplierId;

    private Integer secSupplierId;

    private Date date;

    private Integer isComplete;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOderNum() {
        return oderNum;
    }

    public void setOderNum(Integer oderNum) {
        this.oderNum = oderNum;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getMainSupplierId() {
        return mainSupplierId;
    }

    public void setMainSupplierId(Integer mainSupplierId) {
        this.mainSupplierId = mainSupplierId;
    }

    public Integer getSecSupplierId() {
        return secSupplierId;
    }

    public void setSecSupplierId(Integer secSupplierId) {
        this.secSupplierId = secSupplierId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }
}