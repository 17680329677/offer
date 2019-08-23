package com.dhz.offer;

import com.dhz.struct.TreeNode;

/**
 * 判断树A中是否存在树B的子结构
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/23 16:31
 */
public class offer25 {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {

        if (root1 == null || root2 == null)
            return false;

        if (root1ContainsRoot2(root1, root2)) {
            return true;
        } else {
            return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
        }
    }

    public boolean root1ContainsRoot2(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val == root2.val) {
            return root1ContainsRoot2(root1.left, root2.left) && root1ContainsRoot2(root1.right, root2.right);
        } else {
            return false;
        }
    }
}
