package com.dhz.design_pattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 21:46
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
