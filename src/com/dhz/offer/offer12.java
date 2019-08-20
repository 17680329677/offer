package com.dhz.offer;

/**
 * 一次可以跳 1、 2、 ... 、 n阶
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/20 17:21
 */
public class offer12 {

    /**
     * 一级台阶：1种 f=fib(1)=1=2^（1-1）
     * 二级台阶：2种 f=fib(2)=2=2^（2-1）
     * 三级台阶：3种 f=fib(3)+1=4=2^（3-1）
     * 四级台阶：5种 f=fib(4)+3=8=2^（4-1）
     * 五级台阶：8种 f=fib(5)+8=16=2^（5-1）
     * 六级台阶：13种 f=fib(6)+19=32=2^（6-1）
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
    }
}
