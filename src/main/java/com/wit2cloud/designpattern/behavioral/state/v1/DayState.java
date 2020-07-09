package com.wit2cloud.designpattern.behavioral.state.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: DayState
 * @Desc: TODO
 * @history v1.0
 */
public class DayState implements State {

     private int nowTime = 12;




    @Override
    public void doClock(Context ctx,int nowTime) {
            this.nowTime = nowTime;
            if (nowTime < 6 || nowTime >= 18) {
                //晚上
                ctx.setState(DayTypeEnum.NIGHT.value);
                System.out.println("==== 切换[NightState]环境ctx:"+ctx.getState());
            }else {
                System.out.println("==== 当前[DayState]环境ctx:"+ctx.getState());
            }
    }

    // 设计抽象类，做为程序访问依赖的接口（面向接口编程或抽象编程）

    @Override
    public void doUse() {
        System.out.println("当前[DayState],白天使用.");

    }

    @Override
    public void doAlarm() {
        System.out.println("当前[DayState],白天警报响.");
    }

    @Override
    public void doPhone() {
        System.out.println("当前[DayState],白天拨电话.");
    }
}
