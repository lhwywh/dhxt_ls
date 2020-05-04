package xyz.lsgdut.dhxt.bean;

public class Part {

    public Part() {
    }

    public Part(int partId, String partName, float price, int mainSupplierId, int secSupplierId, int num, int criticalValue) {
        this.partId = partId;
        this.partName = partName;
        this.price = price;
        this.mainSupplierId = mainSupplierId;
        this.secSupplierId = secSupplierId;
        this.num = num;
        this.criticalValue = criticalValue;
    }

    private int partId;

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    @Override
    public String toString() {
        return "part{" +
                "partid=" + partId +
                ", partName='" + partName + '\'' +
                ", price=" + price +
                ", mainSupplierId=" + mainSupplierId +
                ", secSupplierId=" + secSupplierId +
                ", num=" + num +
                ", criticalValue=" + criticalValue +
                '}';
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMainSupplierId() {
        return mainSupplierId;
    }

    public void setMainSupplierId(int mainSupplierId) {
        this.mainSupplierId = mainSupplierId;
    }

    public int getSecSupplierId() {
        return secSupplierId;
    }

    public void setSecSupplierId(int secSupplierId) {
        this.secSupplierId = secSupplierId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCriticalValue() {
        return criticalValue;
    }

    public void setCriticalValue(int criticalValue) {
        this.criticalValue = criticalValue;
    }

    private String partName;
    private float price;
    private int mainSupplierId;
    private int secSupplierId;
    private int num;
    private int criticalValue;
}