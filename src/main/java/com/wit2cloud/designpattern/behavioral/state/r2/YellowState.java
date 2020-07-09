package com.wit2cloud.designpattern.behavioral.state.r2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import java.rmi.Remote;
import java.util.stream.Collector;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: YelloState
 * @Desc: TODO
 * @history v1.0
 */
public class YellowState implements State{
    @Override
    public void show() {
        System.out.println("[黄灯] 亮...");
        try {
            Thread.sleep(6*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void change(Context ctx) {
        State before = ctx.getState();
        if(before instanceof RedState){
            // 切换绿灯
            ctx.setState(SignalType.GREEN.color);
        }else{
            // 切换红灯
            ctx.setState(SignalType.RED.color);
        }
        ctx.doWork();
    }

    @Override
    public void delay() {
    }
}
