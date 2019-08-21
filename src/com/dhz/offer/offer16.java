package com.dhz.offer;

/**
 *  剪绳子
 *
 * 给你一根长度为n的绳子，请把绳子剪成m段（m，n都是大于1 的整数）。每段绳子长度的可能最大乘积是多少
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/21 16:58
 */
public class offer16 {

    /**
     * 方法一： 动态规划
     *  f(n) = max(f(i) * f(n - i))
     *  避免重复计算， 从顶向下分析，从下至上计算
     * @param length
     * @return
     */
    int maxProductAfterCutting1(int length) {
        if (length < 2)
            return 0;
        if (length == 2)
            return 1;
        if (length == 3)
            return 2;

        int[] products = new int[length + 1];
        products[0] = 0;
        products[1] = 1;
        products[2] = 2;
        products[0] = 3;

        int max = 0;
        for (int i = 4; i <= length; i++) {
            max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int product = products[j] * products[i - j];
                if (max < product)
                    max = product;

                products[i] = max;
            }
        }

        max = products[length];
        return max;
    }

    int maxProductAfterCutting2(int length) {

        if (length < 2)
            return 0;
        if (length == 2)
            return 1;
        if (length == 3)
            return 2;

        int timesOf3 = length / 3;
        if (length - timesOf3 * 3 == 1)
            timesOf3 -= 1;

        int timesOf2 = (length - timesOf3 * 3) / 2;
        return (int) (Math.pow(3, timesOf3) * Math.pow(2, timesOf2));
    }
}
