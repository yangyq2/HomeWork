package 实验三.Math_Random;

import java.util.Random;

import static java.lang.Math.*;

public class Test {
    public static void main(String[] args) {
        /*
        常用数学运行方法：求绝对值、三角函数、取整、随机数等
        使用Random生成0-100之间的随机整数
         */
        double a = 10.0,b = -12.0;
        System.out.println("a的绝对值为：" + abs(a) + "，b的绝对值为：" + abs(b));

        /*
        返回一个值的反正弦；返回的角度范围在 -pi/2 到 pi/2 之间。特殊情况如下：
            如果参数为 NaN 或它的绝对值大于 1，那么结果为 NaN。
            如果参数为 0，那么结果为 0，符号与参数符号相同。
         */
        System.out.println("sin(45°)：" + sin(Math.PI/4));

        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println("随机数："+randomNumber);
    }
}
