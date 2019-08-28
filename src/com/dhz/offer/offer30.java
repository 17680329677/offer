package com.dhz.offer;

import com.dhz.struct.TreeNode;

import java.util.ArrayList;

/**
 * 按行从上到下打印二叉树
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 21:27
 */
public class offer30 {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        //存放要打印的节点
        ArrayList<TreeNode> temp = new ArrayList<>();

        //存放返回的节点
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (pRoot == null) {
            return result;
        }

        int count;  //记录当前打印节点的个数
        int next;   //记录下一行要打印的节点

        temp.add(pRoot);
        while (!temp.isEmpty()) {
            count = 0;
            next = temp.size();
            ArrayList<Integer> list = new ArrayList<>();

            while (count < next) {
                TreeNode node = temp.remove(0);
                list.add(node.val);
                count++;
                if (node.left != null) {
                    temp.add(node.left);
                }
                if (node.right != null) {
                    temp.add(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
