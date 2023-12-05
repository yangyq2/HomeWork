package 面向对象实验二._01超市购物;
import static 面向对象实验二._01超市购物.Market.initProArr;
import static 面向对象实验二._01超市购物.Market.initShopArr;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Market market = new Market("万德隆",initProArr(),initShopArr());
        market.menu();
    }
}
