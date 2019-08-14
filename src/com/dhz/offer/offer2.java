package com.dhz.offer;

//题目二：在一个长度为n+1的数组里，所有数字在1～n范围内，所以至少又一个是重复的。请找出其中任意一个重复的数组
//不修改原数组
//原理：类似于二分法，统计 1～中值 的个数，当数量超过时，说明重复的数字在左面，反之则在右面
//缺点：不一定能找出所有的重复数字

public class offer2 {

    /**
     * 法一：O（n * logn）
     * 类似于二分法，由于题目所述，可二分统计在 1-m中间的个数，逐步缩小范围
     *
     * @param numbers
     */
    public static void getDuplicated(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        int start = 1;
        int end = numbers.length - 1;
        int middle;
        int count;

        while (end >= start) {
            middle = ((end - start) >> 1) +start;
            count = 0;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] >= start && numbers[i] <= end) {
                    count++;
                }
            }
            if (end == start) {
                if (count > 1) {
                    System.out.println("get duplicated number:" + start);
                } else {
                    System.out.println("no duplicated number!");
                }
                return;
            }

            if (count > middle - start + 1) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
    }

    public static void getDuplicated2(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        int[] temp = new int[numbers.length];
        for (int i = 1; i < numbers.length; i++) {
            if (temp[numbers[i]] == numbers[i]) {
                System.out.println("duplicated number: " + numbers[i]);
                return;
            } else {
                temp[numbers[i]] = numbers[i];
            }
        }
        System.out.println("no duplicated");
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 4};
        offer2.getDuplicated(numbers);
    }
}
