package com.hct.stringdemo;

import java.util.*;

/**
 * @Author HCT
 * @Date 2021/4/10 15:15
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        String str = "({])";
        boolean valid = isValid(str);
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0;i < s.length();i++){
            char  ch = s.charAt(i);
            if (map.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() != map.get(ch)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();


    }
}
