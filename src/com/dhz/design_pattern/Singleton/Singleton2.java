package com.dhz.design_pattern.Singleton;

/**
 * 2、懒汉式 线程安全
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:30
 */
public class Singleton2 {

    private static Singleton2 instance;
    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {
        if (instance == null)
            instance = new Singleton2();
        return instance;
    }

}
