package 面向对象作业二.Test2_4;

public class Outer implements Anonymity {

    //成员内部类：在一个类中定义类，这样的类被称为成员内部类，在成员内部类中可以访问外部类的所有成员
    //成员内部内
    class inner {
        void show() {
            System.out.println("我是成员内部类");
        }
    }

    public void showInner(){
        inner i = new inner();
        i.show();
    }

    //方法内部类：方法中定义的类，他只能在当前方法中被使用
    public void showIne(){
        //方法内部类
        class Ine {
            void show(){
                System.out.println("我是方法内部类");
            }
        }

        Ine i=new Ine();
        i.show();
    }


    //静态内部类：用static关键字来修饰一个成员内部类，该内部类被称为成员内部类。它可以再不创建外部类对象的情况下被实例化
    static class Static{
        void show(){
            System.out.println("我是静态内部类");
        }
    }
    public void showStatic(){
        Static s = new Static();
        s.show();
    }

    //匿名内部类：需要接口来实现
    @Override
    public void showAnonymity() {
        System.out.println("我是匿名内部类");
    }

}
