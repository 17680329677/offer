package com.dhz.design_pattern.ProxyPattern;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 21:39
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}


