package 面向对象实验二._02继承关系定义交通工具;

public class Test {
    public static void main(String[] args) {
        Transportation train = new Train("高速列车");
        train.work();
        train.sound();
        train.scrap();

        Transportation airplane = new Airplane("客机");
        airplane.work();
        airplane.sound();
        airplane.scrap();
    }
}
