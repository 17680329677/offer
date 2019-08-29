package com.dhz.design_pattern.ProxyPattern;

/**
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/29 21:42
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
