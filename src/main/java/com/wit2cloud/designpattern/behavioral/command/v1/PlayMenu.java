package com.wit2cloud.designpattern.behavioral.command.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: PlayMenu
 * @Desc: TODO
 * @history v1.0
 */
public class PlayMenu {

    private PlayCommand playCmd;
    private PauseCommand pauseCmd;
    private StopCommand stopCmd;

    public PlayMenu(PlayCommand play, PauseCommand pause, StopCommand stop) {
        this.playCmd = play;
        this.pauseCmd = pause;
        this.stopCmd = stop;
    }


    public void open(){
        System.out.println("===播放器已打开===");
    }
    public void clickPlay(){
        playCmd.execute();
    }

    public void clickPause(){
        pauseCmd.execute();
    }

    public void clickStop(){
        stopCmd.execute();
    }


}
