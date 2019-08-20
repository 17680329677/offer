package com.dhz.offer;

/**
 * 斐波那契数列
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/20 17:00
 */
public class offer10 {

    /**
     * 方法一： 递归，重复计算太多，且递归方法需要使用递归函数栈
     * @param n
     * @return
     */
    public int Fibonacci1(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci1(n - 1) + Fibonacci1(n - 2);
        }
    }

    /**
     * 方法二：保存之前的计算，减少重复计算
     * @param n
     * @return
     */
    public int Fibonacci2(int n) {
        int[] res = {0, 1};
        if (n < 2) {
            return res[n];
        }

        int preOne = 1;
        int preTwo = 0;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }
}
