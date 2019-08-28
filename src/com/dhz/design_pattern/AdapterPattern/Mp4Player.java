package com.dhz.design_pattern.AdapterPattern;

/**
 * 高级媒体播放器接口的实现类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 20:52
 */

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}

