package com.tmp.Demo3;

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
        int tmp = n * fac(n-1);  //5!=5*4！ //4！=4*3! //所以得出n!=n*(n-1)!
        return tmp ;
    }

}
