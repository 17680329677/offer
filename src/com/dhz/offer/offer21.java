package com.dhz.offer;

import com.dhz.struct.ListNode;

/**
 * 找到链表倒数第k个节点
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/22 22:36
 */
public class offer21 {

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode pAhead = head;
        ListNode pBhead = head;
        if(head==null||k<=0)    //判断头节点为空，或者k<=0情况
            return null;
        for(int i=0;i<k-1;i++){
            if(pAhead.next==null){   //防止K的值大于head.next的范围    节点3个，k为8；
                return null;
            }
            pAhead = pAhead.next;
        }
        while(pAhead.next!=null){
            pAhead = pAhead.next;
            pBhead = pBhead.next;
        }
        return pBhead;
    }
}
