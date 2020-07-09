package com.wit2cloud.designpattern.behavioral.state.refer.x1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: NightState
 * @Desc: TODO
 * @history v1.0
 */
public class NightState implements State {

    private int nowTime = 0;

    public NightState(){
        new Thread(()->{
            try {
                System.out.println("======启动了doClock方法:"+this);
                doClock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public void doClock() throws InterruptedException {
        while (true) {
            Object lock =  DaySession.getLock();
            synchronized (lock) {
                DaySession.getLock().wait();
            }
            int nowTime1 = DaySession.fetchNowTime();
            Context ctx = DaySession.getCtx();
            this.nowTime = nowTime1;
            System.out.println("[DayState]修改时间为"+nowTime);
            if (nowTime1 >= 6 && nowTime1 < 18) {
                //白天
                ctx.change(DayTypeEnum.DAY.value);
                System.out.println("==== 触发了环境ctx:"+ctx.getState());
                ctx.doWork();
            }
        }
    }

    @Override
    public void doUse() {
        System.out.println("当前时间：" + nowTime + ",晚上使用.");

    }

    @Override
    public void doAlarm() {
        System.out.println("当前时间：" + nowTime + ",晚上警报响.");
    }

    @Override
    public void doPhone() {
        System.out.println("当前时间：" + nowTime + ",晚上拨电话.");
    }
}
