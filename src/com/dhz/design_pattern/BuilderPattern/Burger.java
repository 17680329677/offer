package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能--Burger
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:52
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
