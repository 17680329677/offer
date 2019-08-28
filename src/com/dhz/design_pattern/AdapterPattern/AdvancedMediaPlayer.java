package com.dhz.design_pattern.AdapterPattern;

/**
 * 高级的媒体播放器接口
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 20:50
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
