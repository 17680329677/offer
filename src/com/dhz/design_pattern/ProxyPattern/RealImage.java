package com.dhz.design_pattern.ProxyPattern;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 21:38
 */

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
