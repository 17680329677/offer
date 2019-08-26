package com.dhz.design_pattern.Singleton;

/**
 * 4、双重校验锁
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/26 21:33
 */
public class Singleton4 {

    private volatile static Singleton4 instance;
    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null)
                    instance = new Singleton4();
            }
        }
        return instance;
    }

}
