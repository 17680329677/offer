package com.dhz.offer;

import com.dhz.struct.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 21:45
 */
public class offer31 {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayListAllLevel = new ArrayList<>();
        if (pRoot == null)     return arrayListAllLevel;
        //stack1暂存奇数层结点
        Stack<TreeNode> stack1 = new Stack<>();
        //stack2暂存偶数层结点
        Stack<TreeNode> stack2 = new Stack<>();
        //初始层为第一层
        int level = 1;
        //将第一层的结点按从左到右的顺序入栈
        stack1.push(pRoot);

        while (!stack1.isEmpty() || !stack2.isEmpty()){
            //保存该层中栈的元素
            ArrayList<Integer> arrayListlevel = new ArrayList<>();
            //判断是哪一个栈进行出栈操作
            if (level % 2 == 1){
                //当奇数层执行出栈操作时
                //如果stack1还存在元素，则继续出栈
                while ( !stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    //在出栈的同时，将此节点的左右子节点入stack2
                    //同时存入另一个栈的顺序是先存左子节点，再存右子节点
                    arrayListlevel.add(node.val);
                    if (node.left != null)   stack2.push(node.left);
                    if (node.right != null)  stack2.push(node.right);
                }
                level ++;
                //stack1中所有元素出栈完毕后，将奇数层次的所有元素加入到整个线性表中
                arrayListAllLevel.add(arrayListlevel);
            }else {
                //stack2执行出栈操作
                //当偶数层执行出栈操作时
                //如果stack2还存在元素，则继续出栈
                while ( !stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    //出栈同时加入到奇数层次的数组中
                    arrayListlevel.add(node.val);
                    //在出栈的同时，将此节点的左右子节点入stack1
                    //同时存入另一个栈的顺序是先存右子节点，再存左子节点
                    if (node.right != null)  stack1.push(node.right);
                    if (node.left != null)   stack1.push(node.left);
                }
                level ++;
                //stack2中所有元素出栈完毕后，将偶数层次的所有元素加入到整个线性表中
                arrayListAllLevel.add(arrayListlevel);
            }
        }
        return arrayListAllLevel;
    }
}
