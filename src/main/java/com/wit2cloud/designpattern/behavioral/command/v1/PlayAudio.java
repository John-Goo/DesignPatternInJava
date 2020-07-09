package com.wit2cloud.designpattern.behavioral.command.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: PlayAudio
 * @Desc: TODO
 * @history v1.0
 */
public class PlayAudio {

    public void play(){
        System.out.println(" === 播放 ===");

    }
    public void pause(){
        System.out.println(" === 暂停 ===");
    }

    public void stop(){
        System.out.println(" === 关闭 ===");
    }
}
