package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建实现 Packing 接口的实体类--瓶子
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:49
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
