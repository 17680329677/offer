package com.dhz.design_pattern.DecoratorPattern;

/**
 * 创建扩展了 ShapeDecorator 类的实体装饰类。
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 21:10
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
