package com.dhz.offer;

import com.dhz.struct.TreeNode;

import java.util.ArrayList;

/**
 * 从上到下打印二叉树
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 22:27
 */
public class offer29 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode temp = queue.remove(0);
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
