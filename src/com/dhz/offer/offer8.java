package com.dhz.offer;

import java.util.Stack;

/**
 * 使用两个栈实现一个队列
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/20 16:34
 */
public class offer8 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * 1、入队的操作就直接往一个栈中push
     * 2、出队时分两种情况：
     *      当另一个栈为空时，将入队使用的栈的元素全部pop并push到当前栈；
     *      当另一个栈不为空时，直接返回出栈元素即可
     * @param node
     */
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
