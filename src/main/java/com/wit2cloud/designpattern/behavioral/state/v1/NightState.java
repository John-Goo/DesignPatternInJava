package com.wit2cloud.designpattern.behavioral.state.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import com.wit2cloud.designpattern.behavioral.state.refer.x1.DaySession;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: NightState
 * @Desc: TODO
 * @history v1.0
 */
public class NightState implements State {


    @Override
    public void doClock(Context ctx,int nowTime)  {
            if (nowTime >= 6 && nowTime < 18) {
                //白天
                ctx.setState(DayTypeEnum.DAY.value);
                System.out.println("==== 切换[DayState]环境ctx:"+ctx.getState());
            }else {
                System.out.println("==== 当前[NightState]环境ctx:"+ctx.getState());
            }
    }

    @Override
    public void doUse() {
        System.out.println("当前[NightState],晚上使用.");

    }

    @Override
    public void doAlarm() {
        System.out.println("当前[NightState],晚上警报响.");
    }

    @Override
    public void doPhone() {
        System.out.println("当前[NightState],晚上拨电话.");
    }
}
