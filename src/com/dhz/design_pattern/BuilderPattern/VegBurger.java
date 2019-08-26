package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建扩展了 Burger的实体类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:55
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
