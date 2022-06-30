package com.hct.StackForQueue;

import java.util.Stack;

/**
 * 用两个栈实现队列----只能一次性的全部入队或者出队
 *
 * 队列是先进先出，栈是先进后出。
 * stack1栈实现入队功能，stack2栈实现出队功能。
 *
 * 对于push操作，直接将值压入stack1中。
 *
 * 对于pop操作，先判断stack2是否为null,如果不为null，直接返回stack2的栈顶元素，
 * 如果stack2为null，再判断stack1是否为null,如果stack1为null，则没有数据，pop()失败，返回-1，
 * 如果stack1不为null，则将stack1中的元素依次弹出后压入stack2中，再返回stack2的栈顶元素。
 *
 * @Author HCT
 * @Date 2021/4/9 23:32
 * @Version 1.0
 */
public class Demo1 {

    //test sourcetree
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();


    public void push(int node) {

       stack1.push(node);

    }


    public int pop() {
        if (stack2.isEmpty()){
            if (stack1.isEmpty()){
                return -1;
            } else {
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }
        } else{
            return stack2.pop();
        }

    }
}
