package xyz.lsgdut.dhxt.pojo.VO;

import cn.afterturn.easypoi.excel.annotation.Excel;
import xyz.lsgdut.dhxt.pojo.Orderform;

import java.util.Date;

public class OrderVO {
    @Excel(name = "订单ID", orderNum = "0",width = 20)
    private Integer orderId;
    @Excel(name = "订货数量", orderNum = "1",width = 20)
    private Integer oderNum;
    @Excel(name = "零件ID", orderNum = "2",width = 20)
    private Integer partId;
    @Excel(name = "零件名称", orderNum = "3",width = 20)
    private String partName;
    @Excel(name = "主要供应商ID", orderNum = "4",width = 20)
    private Integer mainSupplierId;

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    @Excel(name = "主要供应商", orderNum = "5",width = 20)
    private String  mainSupplierName;
    private Integer isComplete = 0;


    public OrderVO(Integer orderId, Integer oderNum, Integer partId, String partName, Integer mainSupplierId,
                   Integer secSupplierId, Date date, String mainSupplierName, String secSupplierName,Integer isComplete) {
        this.orderId = orderId;
        this.oderNum = oderNum;
        this.partId = partId;
        this.partName = partName;
        this.mainSupplierId = mainSupplierId;
        this.secSupplierId = secSupplierId;
        this.date = date;
        this.isComplete = isComplete;
        this.mainSupplierName = mainSupplierName;
        this.secSupplierName = secSupplierName;
    }

    public OrderVO(PartinfoVO partinfoVO, Orderform order) {
        this.orderId = order.getOrderId();
        this.oderNum = order.getOderNum();
        this.partId = order.getPartId();
        this.partName = partinfoVO.getPartName();
        this.mainSupplierId = order.getMainSupplierId();
        this.secSupplierId = order.getSecSupplierId();
        this.date = order.getDate();
        this.mainSupplierName = partinfoVO.getMainSupplierName();
        this.secSupplierName = partinfoVO.getSecSupplierName();
        this.isComplete = order.getIsComplete();
    }
    @Excel(name = "次要供应商ID", orderNum = "6",width = 20)
    private Integer secSupplierId;
    @Excel(name = "次要供应商", orderNum = "7",width = 20)
    private String secSupplierName;
    @Excel(name = "订货时间",exportFormat = "yyyy-MM-dd HH:mm:ss", orderNum = "8" ,width = 20)
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
