package 面向对象作业二.Test2_4;

public class Test {
    public static void main(String[] args) {

        Outer o = new Outer();
        o.showInner();   //调用成员内部类
        o.showIner();  //调用方法内部类
        o.showStatic();  //调用静态方法
        o.showAnonymity();  //匿名类方法
    }
}
