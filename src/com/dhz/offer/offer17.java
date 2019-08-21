package com.dhz.offer;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/21 17:22
 */
public class offer17 {

    public int NumberOf1(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
