package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建扩展了 Burger的实体类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:56
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
