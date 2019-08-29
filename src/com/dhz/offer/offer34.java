package com.dhz.offer;

import com.dhz.struct.RandomListNode;

/**
 * 复杂链表的复制
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 22:03
 */
public class offer34 {

    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) {
            return null;
        }
        RandomListNode node = pHead;
        // 遍历链表将复制结点放在当前结点的后面
        while(node != null) {
            RandomListNode newNode = new RandomListNode(node.label);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }
        node = pHead;
        // 遍历链表 将复制结点的random指向当前结点的random的next
        while(node != null && node.next != null) {
            if(node.random != null) {
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }
        RandomListNode res = pHead.next;
        node = pHead;
        RandomListNode node1 = res;
        // 拆分链表
        while(node != null && node.next != null) {
            node.next = node.next.next;
            node1.next = node.next == null ? null : node.next.next;
            node1 = node1.next;
            node = node.next;
        }
        return res;
    }

}
