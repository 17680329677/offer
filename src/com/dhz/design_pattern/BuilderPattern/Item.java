package com.dhz.design_pattern.BuilderPattern;

/**
 * 创建一个表示食物条目的接口
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:47
 */
public interface Item {

    public String name();
    public Packing packing();
    public float price();

}
