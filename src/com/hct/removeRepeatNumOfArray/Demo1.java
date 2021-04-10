package com.hct.removeRepeatNumOfArray;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试未完全通过
 *
 * @Author HCT
 * @Date 2021/4/10 0:20
 * @Version 1.0
 */
public class Demo1 {

    public static int duplicate (int[] numbers) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(numbers[0],1);
        for (int i = 1;i < numbers.length;i++){
            if (map.containsKey(numbers[i])){
                return numbers[i];

            }else{
                map.put(numbers[i],1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            int[] arr = {3,5,2,1,0,5,3};
        System.out.println(duplicate(arr));
    }
}
