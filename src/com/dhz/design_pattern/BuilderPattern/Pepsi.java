package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建扩展了 ColdDrink的实体类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:58
 */

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}

