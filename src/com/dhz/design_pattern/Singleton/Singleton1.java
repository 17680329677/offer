package com.dhz.design_pattern.Singleton;

/**
 * 1、懒汉式 非线程安全
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:27
 */
public class Singleton1 {

    private static Singleton1 instance;
    private  Singleton1() {}

    public static Singleton1 getInstance() {
        if (instance == null)
            instance = new Singleton1();
        return instance;
    }
}
