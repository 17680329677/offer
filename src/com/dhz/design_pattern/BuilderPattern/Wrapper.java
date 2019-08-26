package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建实现 Packing 接口的实体类--纸包装
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:48
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
