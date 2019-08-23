package com.dhz.offer;

import com.dhz.struct.ListNode;

import java.util.List;

/**
 * 翻转一个链表
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/23 15:55
 */
public class offer23 {

    public ListNode ReverseList(ListNode head) {

        if (head == null)
            return null;

        ListNode pre = null;
        ListNode next = head.next;

        while (head != null) {
            head.next = pre;
            pre = head;
            head = next;
            if (head != null)
                next = head.next;
        }
        return pre;
    }

}
