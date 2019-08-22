package com.dhz.offer;

import com.dhz.struct.ListNode;

/**
 * 判断链表是否有环，并输出环的起点
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/22 22:47
 */
public class offer22 {

    /**
     * 1）选择快慢指针，让快指针每次走两步，慢指针每次走一步，若是单链表中有环的话，那么两个指针会相遇，即指向的相同的节点的值相等来判断。
     *
     * 2）当相遇的时候，慢指针在环中走了k步，设环之外的部分长为x,环的长度为n,则快指针一共走了 x+m*n步，（m为快指针在环中走的圈数），慢指针一共走了x+k步，因为快指针的速度是慢指针的两倍。那么可以得到2(x+k)=x+m*n+k;得到x为m*n-k ,慢指针在圈中还剩下的步数n-k;
     *
     * 二、
     *
     * 让快指针从头开始，两个指针每次都走一步，当快指针走了想x(m*n-k)步的时候，到达环的入口，慢指针在圈中走m-1圈加k步的时候，也到达环入口那个节点，两个指针再次相遇，此刻的节点就是环的入口的节点。
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)
            return null;
        ListNode fast = pHead;//快指针每次走两步
        ListNode slow = pHead;//每次走一步
        while(fast!=null && fast.next !=null)//因为fast每次要走两步，所有需要判断fast的下一个是否为空
        {
            slow = slow.next;
            fast = fast.next.next;
            //判断是否相遇 相遇后让快指针从头开始走，每次都是走一步，第二次相遇的节点就是环的入口
            if(fast.val == slow.val)
            {
                fast = pHead;
                while(fast.val != slow.val)
                {
                    fast = fast.next;
                    slow = slow.next;
                }
            }
            if(fast.val == slow.val)
            {
                return slow;
            }
        }
        return null;//要是没有相遇，此链表没有环返回空
    }

}
