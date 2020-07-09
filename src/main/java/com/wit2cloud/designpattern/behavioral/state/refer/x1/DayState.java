package com.wit2cloud.designpattern.behavioral.state.refer.x1;
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

    volatile private int nowTime = 12;

    public DayState() {
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
            Object lock = DaySession.getLock();
            synchronized (lock) {
                lock.wait();
            }
            int nowTime1 = DaySession.fetchNowTime();
            Context ctx = DaySession.getCtx();

            this.nowTime = nowTime1;
            System.out.println("[DayState]修改时间为"+nowTime);
            if (nowTime1 < 6 || nowTime1 >= 18) {
                //晚上
                ctx.change(DayTypeEnum.NIGHT.value);
                System.out.println("==== 触发了环境ctx:"+ctx.getState());
                ctx.doWork();
            }
        }
    }

    @Override
    public void doUse() {
        System.out.println("当前时间：" + nowTime + ",白天使用.");

    }

    @Override
    public void doAlarm() {
        System.out.println("当前时间：" + nowTime + ",白天警报响.");
    }

    @Override
    public void doPhone() {
        System.out.println("当前时间：" + nowTime + ",白天拨电话.");
    }
}
