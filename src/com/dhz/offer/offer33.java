package com.dhz.offer;

import com.dhz.struct.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 22:01
 */
public class offer33 {

    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
        if (root == null)return listAll;

        list.add(root.val);
        target = target - root.val;

        if (target == 0 && root.left == null && root.right == null){
            //这里必须要重新生成一个对象实例，并使用list对其初始化赋值
            listAll.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        //模拟了栈回退,当前节点为叶子节点或者已经访问过的情况下，回溯到父节点
        list.remove(list.size()-1);
        return listAll;
    }

    // -----------------------------------------------------------------------------------------------------

    // 常规做法 利用栈
    public ArrayList<ArrayList<Integer>> FindPath2(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
        if(root==null)
            return pathList;
        Stack<Integer> stack=new Stack<Integer>();
        FindPathCore(root,target,stack,pathList );
        return pathList;
    }
    private void FindPathCore(TreeNode root, int target,
                          Stack<Integer> path,
                          ArrayList<ArrayList<Integer>> pathList) {
        if(root==null)
            return;
        if(root.left==null&&root.right==null){
            if(root.val==target){
                ArrayList<Integer> list=
                        new ArrayList<Integer>();
                for(int i:path){
                    list.add(new Integer(i));
                }
                list.add(new Integer(root.val));
                pathList.add(list);
            }
        }
        else{
            path.push(new Integer(root.val));
            FindPathCore(root.left, target-root.val, path, pathList);
            FindPathCore(root.right, target-root.val, path,  pathList);
            path.pop();
        }
    }

}
