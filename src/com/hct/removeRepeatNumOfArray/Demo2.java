package com.hct.removeRepeatNumOfArray;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author HCT
 * @Date 2021/4/10 0:44
 * @Version 1.0
 */
public class Demo2 {

    public static int duplicate (int[] numbers) {
       int[] arr = new int[numbers.length];
       for (int i = 0;i < numbers.length;i++){
           arr[numbers[i]]++;
           if (arr[numbers[i]] == 2){
               return numbers[i];
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,1,0,5,3};
        System.out.println(duplicate(arr));
    }
}
