package com.dhz.offer;

import com.dhz.struct.ListNode;

/**
 * 合并两个有序链表
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/23 16:04
 */
public class offer24 {

    // 使用循环实现
    public ListNode Merge1(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode mergeHead = null;
        if (list1.val < list2.val) {
            mergeHead = list1;
            list1 = list1.next;
        }
        else {
            mergeHead = list2;
            list2 = list2.next;
        }
        ListNode tmpNode = mergeHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tmpNode.next = list1;
                list1 = list1.next;
            } else {
                tmpNode.next = list2;
                list2 = list2.next;
            }
            tmpNode = tmpNode.next;
        }

        if (list1 == null) {
            tmpNode.next = list2;
        } else {
            tmpNode.next = list1;
        }
        return mergeHead;
    }


    /**
     * 递归实现
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge2(ListNode list1, ListNode list2) {
        /**
         * 如果输入的链表中只要有一个为null，就返回另一个
         */
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        // 合并后链表的头节点
        ListNode mergeHead = null;
        if (list1.val < list2.val) {
            mergeHead = list1;
            mergeHead.next = Merge2(list1.next, list2);
        } else {
            mergeHead = list2;
            mergeHead.next = Merge2(list1, list2.next);
        }
        return mergeHead;
    }
}
