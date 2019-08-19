package com.dhz.offer;

import com.dhz.struct.ListNode;
import com.dhz.struct.TreeNode;

/**
 * 给定二叉树的前序和中序遍历，重建二叉树
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/19 20:23
 */



public class offer6 {

//    startPre+1，指的是前序遍历左子树的开始位置，即前序遍历根节点的下一个节点。
//
//    i-startIn，i指的是中序遍历根节点的位置，减去中序遍历开始位置即左子树的长度。所以startPre+i-startIn是前序遍历左子树结束的位置。
//
//    i-startIn+startPre+1，即startPre+(i-startIn)+1，即从startPre位置越过左孩子及其子节点的偏移值再往下一个节点走。
//
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode node = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return node;
    }
    //重载
    private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn){
        //判断数组是否为空
        if(startPre > endPre || startIn > endIn){
            return null;
        }
        TreeNode node = new TreeNode(pre[startPre]);
        for(int i = startIn; i <= endIn; i++){
            if(pre[startPre] == in[i]){
                //注意边界
                node.left = reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                node.right = reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }

        }
        return node;
    }
}
