package com.dhz.design_pattern.ObserverPattern;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 21:48
 */

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}

