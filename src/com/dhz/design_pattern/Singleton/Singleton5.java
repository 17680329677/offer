package com.dhz.design_pattern.Singleton;

/**
 * 5、静态内部类 Holder方式  线程安全
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:38
 */
public class Singleton5 {

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5() {}

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
