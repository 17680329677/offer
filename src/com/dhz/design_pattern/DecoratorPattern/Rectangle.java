package com.dhz.design_pattern.DecoratorPattern;

/**
 * 创建实现接口的实体类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 21:07
 */

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

