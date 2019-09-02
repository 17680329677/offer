package com.dhz.offer;

/**
 * 字符串的排列
 * @author hezhe.du
 * @version 1.0
 * @date 2019/9/2 22:12
 */
public class offer38 {

    public static void main(String[] args) {
        String string = "abc";
        permutation(string.toCharArray(), 0);
    }

    public static void permutation(char[] arr, int begin) {

        if (begin == arr.length - 1) {
            String result = new String(arr);
            System.out.println(result);
        } else {
            for (int i = begin; i < arr.length; i++) {
                swap(arr, begin, i);
                permutation(arr, begin + 1);
                swap(arr, begin, i);
            }
        }
    }

    public static void swap(char[] arr, int index1, int index2) {
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
