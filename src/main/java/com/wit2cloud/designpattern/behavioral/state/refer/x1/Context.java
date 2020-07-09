package com.wit2cloud.designpattern.behavioral.state.refer.x1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Context
 * @Desc: TODO
 * @history v1.0
 */
public class Context {

    private State state;

    public State getState(){
        return state;
    }

    public Context(State state) {
        this.state = state;
    }

    public void change(State state1){
        this.state = state1;
    }

    public synchronized void doWork() throws InterruptedException {
        state.doUse();
        state.doAlarm();
        state.doPhone();
    }


}
