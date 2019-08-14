package com.dhz.offer;

import java.util.HashMap;

//题目一：在一个长度为n的数组里，所有数字都在0～n-1的范围内。
//数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了多少次。
//请找出数组中任意一个重复的数字。
//空间复杂度为O(1)
//原理：从头到尾扫描数组，当扫描到下标为i的数字时，首先判断这个数
//缺点：修改了原数组

public class offer1 {

    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                    otherwise false


    /**
     * 利用hash的原理  时间复杂度为O（n），空间复杂度为O（n）
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    public boolean duplicate1(int numbers[],int length,int [] duplication) {
        boolean flag = false;
        if (numbers == null || length == 0)
            return flag;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            if (map.containsKey(num)) {
                flag = true;
                duplication[0] = num;
                break;
            }
            map.put(num, 0);
        }
        return flag;
    }


    public boolean duplicate2(int numbers[],int length,int [] duplication) {
       if (numbers == null || length == 0)
           return false;

        //从头到尾扫描数组
       for (int i = 0; i < length; i++) {
           //如果数组不在1——n-1的范围内，直接返回false
           if (numbers[i] < 0 || numbers[i] >= length) {
               return false;
           }
           //当数组中某个元素不等于其下标时，分为两种情况
           while (numbers[i] != i) {
               //如果这个元素与以这个元素值为下标的元素相等（元素本应该在的位置），则说明这个元素重复了
               if (numbers[i] == numbers[numbers[i]]) {
                   //把这个重复的元素存储在duplication[]数组中
                   duplication[0] = numbers[i];
                   return true;
               } else {     //若不相等，即交换，把元素放到与下标对应的位置
                   int temp = numbers[i];
                   numbers[i] = numbers[temp];
                   numbers[temp] = temp;
               }
           }
       }
       return false;
    }
}
