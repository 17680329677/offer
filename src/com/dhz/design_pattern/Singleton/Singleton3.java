package com.dhz.design_pattern.Singleton;

/**
 * 3、饿汉式 线程安全
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:32
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();
    private Singleton3() {}

    public static Singleton3 getInstance() {
        return instance;
    }
}
