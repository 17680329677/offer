package com.dhz.offer;

/**
 * 数组中出现次数超过一半的数组
 * @author hezhe.du
 * @version 1.0
 * @date 2019/9/2 22:27
 */
public class offer39 {

    // 基于partition
    public int MoreThanHalfNum_Solution1(int [] arr) {
        if(arr == null || arr.length == 0){
            throw new RuntimeException("输入参数有误！");
        }
        if(arr.length == 1){
            return arr[0];
        }
        int mid = arr.length / 2;       //中间下标

        int low = 0;
        int high = arr.length - 1;
        int index = partition(arr, low, high);
        while(index != mid){
            if(index >mid){
                high = index - 1;
                index = partition(arr, low, high);
            }else{
                low = index + 1;
                index = partition(arr, low, high);
            }
        }

        int result = arr[index];

        //判断中间数有没有超过数组长度的一半
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == result){
                count++;
            }
        }
        if(count <= mid){
            throw new RuntimeException("出现次数没有超过一半的数字");
        }
        return result;
    }

    public int partition(int[] arr, int low, int high) {
        int temp = arr[low];

        while (low < high) {
            while (arr[high] >= temp && low < high) {
                high--;
            }
            if (low < high) {
                arr[low] = arr[high];
                low++;
            }

            while (arr[low] <= temp && low < high) {
                low++;
            }
            if (low < high) {
                arr[high] = arr[low];
                high--;
            }
        }
        arr[low] = temp;
        return low;
    }

    public int moreThanHalfNum(int[] arr){
        //参数校验
        if(arr == null || arr.length == 0)
            throw new RuntimeException("输入参数有误！");

        int result = arr[0];
        int times = 1;
        for(int i = 1; i < arr.length; i++){
            if(times == 0){
                result = arr[i];
                times = 1;
            }
            else if(arr[i] == result)
                times++;
            else
                times--;
        }

        //判断是否数组中的数字有超过半数的
        times = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == result){
                times++;
            }
        }
        if(times <= arr.length / 2){
            return 0;
        }
        return result;
    }

}
