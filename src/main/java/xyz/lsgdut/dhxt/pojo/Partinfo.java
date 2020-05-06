package xyz.lsgdut.dhxt.pojo;

public class Partinfo {
    private Integer partId;

    private String partName;

    private Float partPrice;

    private Integer mainSupplierId;

    private Integer secSupplierId;

    private Integer partNum;

    private Integer criticalValue;

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

    public Integer getCriticalValue() {
        return criticalValue;
    }

    public void setCriticalValue(Integer criticalValue) {
        this.criticalValue = criticalValue;
    }
}