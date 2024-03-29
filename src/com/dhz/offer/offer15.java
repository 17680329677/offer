package com.dhz.offer;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/21 16:29
 */
//地上有一个m行n列的方格。一个机器人从坐标(0, 0)的格子开始移动，它每一次可以向左、右、上、下移动一格，
// 但不能进入行坐标和列坐标的数位之和大于k的格子。
// 例如，当k为18时，机器人能够进入方格(35, 37)，因为3+5+3+7=18。
// 但它不能进入方格(35, 38)，因为3+5+3+8=19。请问该机器人能够到达多少个格子

public class offer15 {

    public int movingCount(int threshold, int rows, int cols) {

        if (threshold < 0 || rows <= 0 || cols <= 0)
            return 0;

        boolean[] isVistited = new boolean[rows * cols];
        for (boolean v : isVistited) {
            v = false;
        }

        int count = movingCountCore(threshold, rows, cols, 0, 0, isVistited);
        return count;
    }

    int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] isVistited) {
        int count = 0;
        if (check(threshold, rows, cols, row, col, isVistited)) {
            isVistited[row * cols + col] = true;

            count = 1 + movingCountCore(threshold, rows, cols, row - 1, col, isVistited)
                      + movingCountCore(threshold, rows, cols, row + 1, col, isVistited)
                      + movingCountCore(threshold, rows, cols, row, col + 1, isVistited)
                      + movingCountCore(threshold, rows, cols, row - 1, col - 1, isVistited);
        }

        return count;
    }

    boolean check(int threshold, int rows, int cols, int row, int col, boolean[] isVisited) {

        if (row >= 0 && row < rows && col >= 0 && col < cols && getDigitSum(row) + getDigitSum(col) <= threshold && !isVisited[row * cols + col]) {
            return true;
        }
        return false;
    }

    int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
