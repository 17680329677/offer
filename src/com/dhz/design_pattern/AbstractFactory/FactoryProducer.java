package com.dhz.design_pattern.AbstractFactory;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:19
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
