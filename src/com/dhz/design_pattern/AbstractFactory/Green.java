package com.dhz.design_pattern.AbstractFactory;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:09
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }

}
