package com.dhz.offer;

/**
 * 调整数组顺序使奇数位于偶数前面
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/22 22:13
 */
public class offer20 {

    /**
     * 元素的相对位置会改变
     * @param array
     */
    public void reOrderArray1(int [] array) {

        if (array == null || array.length == 0)
            return;

        int begin = 0;
        int end = array.length - 1;

        while (begin < end) {
            if (begin < end && array[begin] % 2 == 1)
                begin++;
            if (begin < end && array[end] % 2 == 0)
                end--;

            if (begin < end) {
                int temp = array[begin];
                array[begin] = array[end];
                array[end] = temp;
            }
        }
    }

    public void reOrderArray2(int [] array) {

        if (array == null || array.length <= 1)
            return;

        int oddNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1)
                oddNum++;
        }

        int[] res = new int[array.length];
        int oddIndex = 0;
        int evenIndex = oddNum;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                res[oddIndex] = array[i];
                oddIndex++;
            } else {
                res[evenIndex] = array[i];
                evenIndex++;
            }
        }
        for (int i = 0; i < res.length; i++) {
            array[i] = res[i];
        }
    }
}
