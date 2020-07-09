package com.wit2cloud.designpattern.behavioral.state.refer.x1;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface State {
    public  void doClock() throws InterruptedException;
    public  void doUse();
    public  void doAlarm();
    public  void doPhone();
}
