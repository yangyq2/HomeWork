package 面向对象实验二._01超市购物;

public class Product {
    private String ProName;
    private int value;//价格
    private int ProAmount;//商品数量

    public Product() {
    }

    public Product(String proName, int value) {
        ProName = proName;
        this.value = value;
    }

    public Product(String proName, int value, int proAmount) {
        ProName = proName;
        this.value = value;
        ProAmount = proAmount;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String proName) {
        ProName = proName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getProAmount() {
        return ProAmount;
    }

    public void setProAmount(int proAmount) {
        ProAmount = proAmount;
    }
}
