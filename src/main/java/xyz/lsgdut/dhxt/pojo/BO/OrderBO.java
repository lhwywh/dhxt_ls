package xyz.lsgdut.dhxt.pojo.BO;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class OrderBO {
    private Integer orderId;

    private Integer oderNum;

    private Integer partId;

    private Integer mainSupplierId;

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    private  Integer isComplete;

    private Integer secSupplierId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    public OrderBO(Integer orderId, Integer oderNum, Integer partId, Integer mainSupplierId,
                   Integer secSupplierId, Date date,Integer isComplete) {
        this.orderId = orderId;
        this.oderNum = oderNum;
        this.partId = partId;
        this.mainSupplierId = mainSupplierId;
        this.secSupplierId = secSupplierId;
        this.isComplete = isComplete;
        this.date = date;
    }

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
}
