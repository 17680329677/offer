package com.dhz.design_pattern.ObserverPattern;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 21:45
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
