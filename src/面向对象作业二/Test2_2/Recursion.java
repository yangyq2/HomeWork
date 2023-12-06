package 面向对象作业二.Test2_2;

import java.util.Scanner;

public class Recursion {
    //用递归计算n!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int n = scanner.nextInt();
        System.out.println(fac(n));
    }

    public static int fac(int n){
        if(n == 1){      //1!=1
            return 1;
        }
        return n * fac(n-1);
    }

}
