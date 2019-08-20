package com.dhz.offer;

/**
 * 青蛙跳台阶问题 f（n） = f（n - 1） + f（n - 2）
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/20 17:11
 */
public class offer11 {

    public int JumpFloor(int target) {
        if (target < 1) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            int preOne = 2;
            int preTwo = 1;
            int res = 0;
            for (int i = 3; i <= target; i++) {
                res = preOne + preTwo;
                preTwo = preOne;
                preOne = res;
            }
            return res;
        }
    }
}
