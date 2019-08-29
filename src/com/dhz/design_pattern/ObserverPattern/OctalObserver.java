package com.dhz.design_pattern.ObserverPattern;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 21:48
 */

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}

