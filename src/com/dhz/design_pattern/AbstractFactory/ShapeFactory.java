package com.dhz.design_pattern.AbstractFactory;

import com.dhz.design_pattern.SimpleFactory.Circle;
import com.dhz.design_pattern.SimpleFactory.Rectangle;
import com.dhz.design_pattern.SimpleFactory.Shape;
import com.dhz.design_pattern.SimpleFactory.Square;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:13
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
