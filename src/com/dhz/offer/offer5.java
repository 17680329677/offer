package com.dhz.offer;

import com.dhz.struct.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 将链表逆序输出，不改变链表结构
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/19 19:55
 */
public class offer5 {

    ArrayList<Integer> res = new ArrayList<>();

    /**
     * 使用递归，可以不使用额外空间
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return res;
        }
        printListFromTailToHead(listNode.next);
        res.add(listNode.val);
        return res;
    }

    /**
     * 使用栈实现
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

}
