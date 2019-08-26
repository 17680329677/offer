package com.dhz.design_pattern.AbstractFactory;

import com.dhz.design_pattern.SimpleFactory.Shape;

/**
 * 建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:17
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
