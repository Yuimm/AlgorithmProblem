package com.hct.Fibonacci;

/**
 * FibonacciDemo----递归
 * 时间：O(2^n) 空间：O(1)
 *
 * @Author HCT
 * @Date 2021/4/9 22:54
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(4));

    }


    public static int Fibonacci(int n) {
        if(n<=1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
