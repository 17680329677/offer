package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建扩展了 ColdDrink的实体类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:57
 */

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
