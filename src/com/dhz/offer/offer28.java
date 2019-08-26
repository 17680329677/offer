package com.dhz.offer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 22:19
 */
public class offer28 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if (pushA.length != popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while ((!stack.isEmpty()) && (stack.peek() == popA[j])) {
                stack.pop();
                j++;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;

    }
}
