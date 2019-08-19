package com.dhz.offer;

import com.dhz.struct.TreeLinkNode;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/19 21:10
 */
public class offer7 {

    /**
     * 该二叉树的中序遍历序列为{d,b,h,e,i,a,f,c,g}。查找情况分为三种
     *
     *     1、节点有右子树，则它的下一个节点就是它的右子树的最左子节点，例如b的下一个节点就是h。
     *     2、节点没有右子树，但是该节点是它父节点的左子节点，则该节点的下一个节点就是它的父节点，例如d的下一个节点就是b。
     *     3、节点没有右子树，且该节点是它父节点的右子节点，这种情况比较复杂，我们可以沿着该节点的父节点一直向上遍历，直到找到一个节点是它父节点的左子节点，
     *        若该节点存在，则该节点的父节点就是我们要找的下一个节点， 否则，该节点就没有下一个节点。
     *     4、第二、三两种情况可以和并为一中
     * @param pNode
     * @return
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        if (pNode == null) {
            return null;
        }

        // 存储节点的下一个节点
        TreeLinkNode pNext = null;

        if (pNode.right != null) {
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null) {
                pRight = pRight.left;
            }
            pNext = pRight;
        } else if (pNode.next != null && pNode.next.left == pNode) {
            pNext = pNode.next;
        } else if (pNode.next != null) {
            TreeLinkNode pCurrent = pNode;
            TreeLinkNode pParent = pNode.next;
            while (pParent != null && pParent.right == pCurrent) {
                pCurrent = pParent;
                pParent = pParent.next;
            }
            pNext = pParent;
        }
        return pNext;
    }
}
