package com.hct.Fibonacci;

/**
 * Fibonacci--非递归
 * 减少栈的开销，用空间换时间 时间：O(n) 空间：O(n)
 *
 * @Author HCT
 * @Date 2021/4/9 23:03
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(4));

    }
    public static int Fibonacci(int n) {
        int arr[] = new int[40];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2;i <= n;i++){
            arr[i] =  arr[i-1] +  arr[i-2];
        }
        return arr[n];
    }
}
