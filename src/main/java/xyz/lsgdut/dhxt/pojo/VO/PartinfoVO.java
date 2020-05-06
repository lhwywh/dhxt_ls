package xyz.lsgdut.dhxt.pojo.VO;

import xyz.lsgdut.dhxt.pojo.Partinfo;

public class PartinfoVO {
    private Integer partId;

    private String partName;

    private Float partPrice;

    private Integer mainSupplierId;

    private Integer secSupplierId;

    public PartinfoVO(Integer partId, String partName, Float partPrice, Integer mainSupplierId, Integer secSupplierId, Integer partNum, int criticalValue, String mainSupplierName, String secSupplierName) {
        this.partId = partId;
        this.partName = partName;
        this.partPrice = partPrice;
        this.mainSupplierId = mainSupplierId;
        this.secSupplierId = secSupplierId;
        this.partNum = partNum;
        this.criticalValue = criticalValue;
        this.mainSupplierName = mainSupplierName;
        this.secSupplierName = secSupplierName;
    }

    public PartinfoVO(Partinfo partinfo,String mainSupplierName,String secSupplierName){
        this.partId= partinfo.getPartId();
        this.criticalValue = partinfo.getCriticalValue();
        this.mainSupplierId = partinfo.getMainSupplierId();
        this.secSupplierId = partinfo.getSecSupplierId();
        this.partPrice=partinfo.getPartPrice();
        this.partNum = partinfo.getPartNum();
        this.mainSupplierName = mainSupplierName;
        this.secSupplierName = secSupplierName;
        this.partName = partinfo.getPartName();
    }

    private Integer partNum;

    @Override
    public String toString() {
        return "PartinfoVO{" +
                "partId=" + partId +
                ", partName='" + partName + '\'' +
                ", partPrice=" + partPrice +
                ", mainSupplierId=" + mainSupplierId +
                ", secSupplierId=" + secSupplierId +
                ", partNum=" + partNum +
                ", criticalValue='" + criticalValue + '\'' +
                ", mainSupplierName='" + mainSupplierName + '\'' +
                ", secSupplierName='" + secSupplierName + '\'' +
                '}';
    }

    private int criticalValue;

    private String mainSupplierName;


    public void setMainSupplierName(String mainSupplierName) {
        this.mainSupplierName = mainSupplierName;
    }

    public String getMainSupplierName() {
        return mainSupplierName;
    }


    public String getSecSupplierName() {
        return secSupplierName;
    }

    public void setSecSupplierName(String secSupplierName) {
        this.secSupplierName = secSupplierName;
    }

    private String secSupplierName;

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

    public Float getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(Float partPrice) {
        this.partPrice = partPrice;
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

    public Integer getPartNum() {
        return partNum;
    }

    public void setPartNum(Integer partNum) {
        this.partNum = partNum;
    }

    public int getCriticalValue() {
        return criticalValue;
    }
}