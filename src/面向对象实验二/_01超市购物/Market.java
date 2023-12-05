package 面向对象实验二._01超市购物;

import java.util.Scanner;

public class Market {
    private String Name;
    private Product[] MarketArr;//商品仓库
    private Product[] ShopArr;//购物车

    public Market() {
    }

    public Market(Product[] marketArr) {
        MarketArr = marketArr;
    }

    public Market(Product[] marketArr, Product[] shopArr) {
        MarketArr = marketArr;
        ShopArr = shopArr;
    }

    public Market(String name, Product[] marketArr, Product[] shopArr) {
        Name = name;
        MarketArr = marketArr;
        ShopArr = shopArr;
    }

    public Market(String name) {
        Name = name;
    }

    void menu() {

        //Market market = new Market();
        while (true) {
            //market.setMarketArr(new Product[]{p1,p2,p3});
            System.out.println("欢迎来到" + Name + "！请选择以下的功能：");
            System.out.println("\t1、查看商品");
            System.out.println("\t2、购买商品");
            System.out.println("\t3、退出购物");
            System.out.print("请输入你需要的操作命令:");
            //键盘输入
            Scanner scanner = new Scanner(System.in);
            int s1 = scanner.nextInt();
            switch (s1) {
                case 1:
                    DisplayMarket();
                    break;
                case 2:
                    shopping();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("你的输入有误！");
            }
        }
    }
    void shopping() {
        int money = 0;
        for (int i = 0; i < ShopArr.length; i++) {
            ShopArr[i].setProAmount(0);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("商品列表：1、" + MarketArr[0].getProName() + " 2、"
                    + MarketArr[1].getProName() +
                    " 3、" + MarketArr[2].getProName());
            System.out.print("你要购买的商品编号：");
            int s1 = scanner.nextInt() - 1;
            if (s1 == 0 || s1 == 1 || s1 == 2) {
                System.out.print("购买的数量：");
                int s2 = scanner.nextInt();
                if (s2 <= MarketArr[s1].getProAmount() && s2 > 0) {
                    MarketArr[s1].setProAmount(MarketArr[s1].getProAmount() - s2);
                    money += s2 * MarketArr[s1].getValue();
                    ShopArr[s1].setProAmount(s2);
                } else if (s2 > MarketArr[s1].getProAmount()) {
                    System.out.println("商品暂时没有那么多");
                } else
                    System.out.println("你的输入有误！");
            } else
                System.out.println("你的输入有误！");
            //购物车显示即将付款的物品
            System.out.println("目前你购物车里面的商品：");
            DisplayShop(money);
            System.out.print("按回车返回");
            Scanner scanner1 = new Scanner(System.in);
            scanner1.nextLine();
            boolean flag = GoShopping();

            if (!flag) return;
        }
    }
    boolean GoShopping() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("是否继续购物：y/n");
            char inputChar = scanner.next().charAt(0);
            if (inputChar == 'y' || inputChar == 'Y') {
                System.out.println("继续购物");
                return true;
            } else if (inputChar == 'n' || inputChar == 'N') {
                System.out.println("返回主界面");
                return false;
            } else {
                System.out.println("你的输入有误");
            }
        }
    }
    //显示购物车里面的东西
    void DisplayShop(int money) {
        //System.out.println(market);
        //Product[] proArr = market.getMarketArr();
        //显示商品信息
        for (int i = 0; i < ShopArr.length; i++) {
            System.out.println("商品名称：" + ShopArr[i].getProName() + "\t商品价格：" + ShopArr[i].getValue() + "\t商品数量："
                    + ShopArr[i].getProAmount());
        }
        System.out.println("目前你的消费为：" + money);
    }
    void DisplayMarket(){
        //显示商品信息
        for (int i = 0; i < MarketArr.length; i++) {
            System.out.println("商品名称：" + MarketArr[i].getProName() + "\t商品价格：" + MarketArr[i].getValue() + "\t商品数量："
                    + MarketArr[i].getProAmount());
        }
    }
    static Product[] initProArr(){
        Product p1 = new Product("香蕉", 2, 50);
        Product p2 = new Product("苹果", 3, 30);
        Product p3 = new Product("电视", 2000, 10);

        return new Product[]{p1, p2, p3};
    }
    static Product[] initShopArr(){
        Product p4 = new Product("香蕉", 2);
        Product p5 = new Product("苹果", 3);
        Product p6 = new Product("电视", 2000);

        return new Product[]{p4, p5, p6};
    }
}