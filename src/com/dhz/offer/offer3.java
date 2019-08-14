package com.dhz.offer;


//在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
//请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class offer3 {

    /**
     * 选择二维数组右上角（或左下角）的数字为起始位置
     * 将角落的数字与target比较
     * 每次可以去掉一行或一列，不断缩小范围
     * @param target
     * @param arr
     * @return
     */
    public static boolean find(int target, int[][] arr) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] < target) {
                row++;
                continue;
            } else if (arr[row][col] > target) {
                col--;
                continue;
            } else if (arr[row][col] == target){
                return true;
            }
        }
        return false;
    }
}
