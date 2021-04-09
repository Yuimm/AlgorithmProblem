package com.hct.Fibonacci;

/**
 * Fibonacci
 * 其实我们可以发现每次就用到了最近的两个数，所以我们可以只存储最近的两个数
 *
 * sum 存储第 n 项的值
 * one 存储第 n-1 项的值
 * two 存储第 n-2 项的值
 *
 * 时间：O(n) 空间：O(1)
 *
 * @Author HCT
 * @Date 2021/4/9 23:11
 * @Version 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(4));
    }


    public static int Fibonacci(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }
        int sum = 0;
        int one = 0;
        int two = 1;
        for (int i = 2;i <= n; i++){
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;

    }
}
