package com.dhz.offer;

/**
 * 旋转数组中的最小数字
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/20 20:50
 */
public class offer13 {

    public int minNumberInRotateArray(int [] array) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int low = 0;
        int high = array.length - 1;
        int indexMid = low;

        while (array[low] >= array[high]) {
            if (high - low == 1) {
                indexMid = high;
                break;
            }

            indexMid = (low + high) / 2;

            if (array[low] == array[high] && array[high] == array[indexMid]) {
                return findMin(array, low, high);
            }

            if (array[indexMid] >= array[low]) {
                low = indexMid;
            } else if (array[indexMid] <= array[high]) {
                high = indexMid;
            }
        }
        return array[indexMid];
    }

    int findMin(int[] array, int start, int end) {
        int res = array[start];
        for (int i = start; i <= end; i++) {
            res = Math.min(res, array[i]);
        }
        return res;
    }
}
