package com.dhz.offer;

import com.dhz.struct.TreeNode;

/**
 * 二叉搜索树与双向链表转换
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 22:14
 */
public class offer35 {

    public static TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode lastNode =null;
        TreeNode headNode=ConvertNode(pRootOfTree, lastNode);
        while (headNode != null && headNode.left != null) {
            headNode = headNode.left;
        }
        return headNode;
    }

    public static TreeNode ConvertNode(TreeNode rootTree, TreeNode lastNode) {
        if (rootTree == null) {
            return null;
        }
        if (rootTree.left != null) {
            lastNode=ConvertNode(rootTree.left, lastNode);
        }
        rootTree.left = lastNode;
        if (lastNode != null) {
            lastNode.right = rootTree;
        }
        lastNode = rootTree;
        if (rootTree.right != null) {
            lastNode=ConvertNode(rootTree.right, lastNode);
        }
        return lastNode;
    }

}
