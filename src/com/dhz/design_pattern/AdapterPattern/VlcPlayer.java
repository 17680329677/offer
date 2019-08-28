package com.dhz.design_pattern.AdapterPattern;

/**
 * 高级媒体播放器接口的实现类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 20:51
 */

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}

