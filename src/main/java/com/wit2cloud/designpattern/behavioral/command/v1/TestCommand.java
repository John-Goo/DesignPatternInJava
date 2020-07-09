package com.wit2cloud.designpattern.behavioral.command.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestCommand
 * @Desc: TODO
 * @history v1.0
 */
public class TestCommand {
    public static void main(String[] args) {
        //接收者
        PlayAudio playAudio = new PlayAudio();
        // 定义命令
        PlayCommand play = new PlayCommand(playAudio);
        PauseCommand pause = new PauseCommand(playAudio);
        StopCommand stop = new StopCommand(playAudio);
        // 执行请求
        PlayMenu playMenu = new PlayMenu(play,pause,stop);
        playMenu.open();
        playMenu.clickPlay();
        playMenu.clickPause();
        playMenu.clickStop();


    }
}
