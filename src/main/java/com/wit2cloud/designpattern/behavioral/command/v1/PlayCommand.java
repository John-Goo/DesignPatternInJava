package com.wit2cloud.designpattern.behavioral.command.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: PlayCommand
 * @Desc: TODO
 * @history v1.0
 */
public class PlayCommand  implements Command{

    private PlayAudio playAudio;

    public PlayCommand(PlayAudio playAudio) {
        this.playAudio = playAudio;
    }

    @Override
    public void execute() {
        playAudio.play();
    }
}
