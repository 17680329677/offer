package com.dhz.design_pattern.AbstractFactory;

import com.dhz.design_pattern.SimpleFactory.Shape;

/**
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂
 *
 * 主要解决：主要解决接口选择的问题。
 * 何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 *
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:12
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;

}
