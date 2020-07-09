package com.wit2cloud.designpattern.behavioral.state.v1;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface State {
    public  void doClock(Context ctx,int nowTime);
    public  void doUse();
    public  void doAlarm();
    public  void doPhone();
}
