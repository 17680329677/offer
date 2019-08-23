package com.dhz.offer;

import com.dhz.struct.TreeNode;

/**
 * 输出一棵树的镜像树
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/23 16:41
 */
public class offer26 {

    public void Mirror(TreeNode root) {

        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null) {
            Mirror(root.right);
        }
    }
}
