package 实验三.常用包装类;

import static java.lang.Integer.parseInt;

public class Test {
    public static void main(String[] args) {
        /*
        熟悉基本数据类型包装类的常用方法
        要求：
        使用valueOf(String s)方法，根据String类型的参数创建包装类对象
        使用parseXXX(String s)的静态方法，将字符串转换为对应的基本类型的数据
         */
        String str = "1000";
        int a = parseInt(str);
        double num = 89.0;
        String str1 = Double.toString(num);
        System.out.println(str);
        System.out.println(a);
        System.out.println(str1);
        System.out.println(num);
    }
}
