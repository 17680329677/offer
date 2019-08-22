package com.dhz.offer;

import com.dhz.struct.ListNode;

/**
 * 删除链表中重复的节点
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/21 22:50
 */
public class offer18 {

    public ListNode deleteDuplication(ListNode pHead){
        if(pHead==null||pHead.next==null) //空结点或者仅一个结点
            return pHead;
        ListNode preNode = null;
        ListNode curNode = pHead;

        while(curNode!=null){
            boolean needDelete=false;
            if(curNode.next!=null && curNode.val==curNode.next.val)
                needDelete=true;
            if(!needDelete){  //当前结点不重复
                preNode=curNode;
                curNode=curNode.next;
            }else{            //当前结点重复
                int dupValue=curNode.val;
                ListNode toBeDel = curNode;
                while(toBeDel!=null&&toBeDel.val==dupValue){
                    //这里删除暂时不涉及前一结点操作，其实主要是找出后面第一个不重复结点
                    toBeDel = toBeDel.next;
                }
                if(preNode==null){  //说明删除的结点为头结点
                    pHead=toBeDel;
                }else{
                    preNode.next=toBeDel;
                }
                curNode=toBeDel;  //这个结点还是可能会出现重复的，所以不能=next
            }
        }
        return pHead;
    }
}
