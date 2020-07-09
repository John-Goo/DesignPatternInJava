package com.wit2cloud.designpattern.behavioral.state.r2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: RedState
 * @Desc: TODO
 * @history v1.0
 */
public class RedState implements State{
    @Override
    public void show() {
        System.out.println("[红灯] 亮...");
        try {
            Thread.sleep(6*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void change(Context ctx) {
        // 切换黄灯
       ctx.setState(SignalType.YELLOW.color);
       ctx.doWork();
    }

    @Override
    public void delay() {
        int count = 6;
        for(;count>0;count--){
            System.out.println(" **** 倒计时:"+count);
            try {
                Thread.sleep(1*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
