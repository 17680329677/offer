package com.dhz.offer;

import com.dhz.struct.TreeNode;

/**
 * 判断一棵树是否是对称二叉树
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/23 16:53
 */
public class offer27 {

    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null) return true;//空树 认为是对称的
        return helper(pRoot.left, pRoot.right);//不是空树，则判断左右子树
    }
    private boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;//待判断的两棵子树都是空树，则是相同的子树
        if(left == null || right == null) return false;//待判断的两棵子树只有一棵为空，则不是相同的子树
        if(left.val != right.val) return false;//待判断的两棵子树结点元素值不相同，则不是相同的子树
        else return helper(left.right, right.left) && helper(left.left, right.right);//判断子树1的右子树和子树2的左子树是否相同，子树1的左子树和子树2的右子树是否相同
    }

}
