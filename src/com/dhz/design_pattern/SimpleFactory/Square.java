package com.dhz.design_pattern.SimpleFactory;

/**
 * 接口实现类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 20:45
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
