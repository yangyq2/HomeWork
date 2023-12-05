package 面向对象作业二.Test2_2;

import java.util.Scanner;

public class Fibonacci {
    //递归算法:斐波那契
    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n+"的斐波那契数列为：");
        System.out.println(fib(n));

    }

    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        else{
            return(fib(n-1)+fib(n-2));
        }
    }

}
