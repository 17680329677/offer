package com.dhz.design_pattern.DecoratorPattern;

/**
 * 创建实现了 Shape 接口的抽象装饰类。
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 21:08
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
