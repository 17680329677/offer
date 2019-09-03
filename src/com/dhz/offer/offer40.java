package com.dhz.offer;

import java.util.HashMap;

/**
 * 连续子数组的最大和
 * @author hezhe.du
 * @version 1.0
 * @date 2019/9/3 21:03
 */
public class offer40 {

    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null||array.length==0){
            return 0;
        }
        // 用currentSum记录当前的和
        int currentSum = 0;
        // 用finalGreatSum记录历史最佳
        int finalGreatSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(currentSum<=0){
                currentSum=array[i];
            }else{
                currentSum+=array[i];//当array[i]为正数时，加上之前的最大值并更新最大值
            }
            // 如果currentSum>finalGreatSum则替换finalGreatSum
            if(finalGreatSum<currentSum){
                finalGreatSum=currentSum;
            }
        }
        return finalGreatSum;
    }

    //解法二：使用动态规划:
    //F（i）：以array[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
    //F（i）=max（F（i-1）+array[i] ， array[i]）
    public class Solution {
        public  int FindGreatestSumOfSubArray(int[] array) {
            int res = array[0]; //记录当前所有子数组的和的最大值
            int max = array[0]; //包含array[i]的连续数组最大值
            for (int i = 1; i < array.length; i++) {
                max=Math.max(max+array[i], array[i]);
                res=Math.max(max, res);
            }
            return res;
        }
    }


}
