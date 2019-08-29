package com.dhz.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 22:30
 */
public class offer36 {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() < 1) {
            return list;
        }
        char[] chs = str.toCharArray();
        getAllRes(list, chs, 0);
        // 要求按字典序打印出该字符串中字符的所有排列，所以将list进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return list;

    }

    private void getAllRes(ArrayList<String> list, char[] chs, int start) {
        //这是递归的终止条件，就是i下标已经移到char数组的末尾的时候，考虑添加这一组字符串进入结果集中
        if (start == chs.length) {
            StringBuffer sb = new StringBuffer();
            for (char c : chs) {
                sb.append(c);
            }
            //判断一下是否重复
            if (!list.contains(sb.toString())) {
                list.add(sb.toString());
            }
        }
        //注释1
        for (int i = start; i < chs.length; i++) {
            swqp(chs, i, start);
            getAllRes(list, chs, start + 1);
            swqp(chs, i, start);
        }
    }

    private void swqp(char[] chs, int start, int end) {
        char temp = chs[start];
        chs[start] = chs[end];
        chs[end] = temp;
    }

}
