package com.dhz.offer;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100",“5e2”,"-123",“3.1416"和”-1E-16"都表示数值。
 * 但是"12e",“1a3.14”,“1.2.3”,"±5"和"12e+4.3"都不是。
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/22 9:48
 */
public class offer19 {


    /**
     * 开始的时候判断出现第一位是否是符号位，若符号位不是初始位返回错误。
     * 当遍历到小数点时，判断小数点后是否满足要求。
     * 若遍历到e时，判断e后是否满足要求 。
     * 没有小数点或者e继续遍历。
     * @param str
     * @return
     */
    public boolean isNumeric(char[] str) {

        if(str==null || str.length < 1){
            return false;
        }
        int len = str.length;
        for(int i = 0 ; i < len ; i++){
            if(str[i] == '+' || str[i] == '-'){
                if(i != 0){
                    return false;
                }else continue;
            }
            if (str[i] == '.'){
                return afterPoint(i+1,len,str);
            }
            if(str[i] == 'e' || str[i] == 'E'){
                return afterE(i+1,len,str);
            }
            if( str[i] < '0' || str[i] > '9'){
                return false;
            }
        }
        return true;
    }

    //小数点后只能是数字或者科学表达式的组合 如 3.2e-10；
    public boolean afterPoint(int a,int len,char[] str){
        if(len-a == 0 || str[a] < '0' || str[a] > '9'){
            return false;
        }
        //小数点后第二位可以是数字也可以是科学计数法
        for(int i = a+1 ; i < len ; i++){
            //非数字或e均报错
            if(str[i] == 'e' || str[i] == 'E'){
                return afterE(i+1,len,str);
            }
            if(str[i] < '0' || str[i] > '9'){
                return false;
            }
        }
        return true;
    }
    //判断首次出现e之后的情况
    public boolean afterE(int a,int len,char[] str){
        //e处于最后一位时报错
        if(len-a == 0){
            return false;
        }
        for(int i = a; i < len ; i++){
            //正负号只能出现在e之后第一位
            if(str[i] == '+' || str[i] == '-'){
                if(i != a){
                    return false;
                }else continue;
            }
            if(str[i] < '0' || str[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
