package com.dhz.design_pattern.AdapterPattern;

/**
 * 创建实现了 MediaPlayer 接口的实体类
 * @author hezhe.du
 * @version 1.0
 * @date 2019/8/28 20:58
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
