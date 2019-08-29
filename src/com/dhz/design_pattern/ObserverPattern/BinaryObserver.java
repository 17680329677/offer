package com.dhz.design_pattern.ObserverPattern;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 21:47
 */

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}

