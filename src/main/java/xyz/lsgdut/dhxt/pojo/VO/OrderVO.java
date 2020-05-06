package xyz.lsgdut.dhxt.pojo.VO;

import xyz.lsgdut.dhxt.pojo.Order;

import java.util.Date;

public class OrderVO {
    private Integer orderId;

    private Integer oderNum;

    private Integer partId;

    private String partName;

    private Integer mainSupplierId;

    public OrderVO(Integer orderId, Integer oderNum, Integer partId, String partName, Integer mainSupplierId,
                   Integer secSupplierId, Date date, String mainSupplierName, String secSupplierName) {
        this.orderId = orderId;
        this.oderNum = oderNum;
        this.partId = partId;
        this.partName = partName;
        this.mainSupplierId = mainSupplierId;
        this.secSupplierId = secSupplierId;
        this.date = date;
        this.mainSupplierName = mainSupplierName;
        this.secSupplierName = secSupplierName;
    }

    public OrderVO(PartinfoVO partinfoVO, Order order) {
        this.orderId = order.getOrderId();
        this.oderNum = order.getOderNum();
        this.partId = order.getPartId();
        this.partName = partinfoVO.getPartName();
        this.mainSupplierId = order.getMainSupplierId();
        this.secSupplierId = order.getSecSupplierId();
        this.date = order.getDate();
        this.mainSupplierName = partinfoVO.getMainSupplierName();
        this.secSupplierName = partinfoVO.getSecSupplierName();
    }

    private Integer secSupplierId;

    private Date date;

    public String getMainSupplierName() {
        return mainSupplierName;
    }

    public void setMainSupplierName(String mainSupplierName) {
        this.mainSupplierName = mainSupplierName;
    }

    public String getSecSupplierName() {
        return secSupplierName;
    }

    public void setSecSupplierName(String secSupplierName) {
        this.secSupplierName = secSupplierName;
    }

    private String  mainSupplierName;

    private String secSupplierName;

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

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
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
