package com.wit2cloud.designpattern.behavioral.template;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: OrderTmeplate
 * @Desc: 点餐模板，有固定的流程和步骤，事先定义框架及抽象方法，具体的方法（算法）实现
 * 延迟到了类实现，通过父类控制反转调用
 * @history v1.0
 */
public abstract class OrderTmeplate {

    public void process(){
        // 扫码点菜
        scanQRCode();
        // 付款
        payOrder();
        // 做菜
        doCookie();
        // 吃饭
        eat();

    }

    public void scanQRCode() {
        System.out.println(">> 打开手机微信，扫二维码，准备点菜...");
    }

    protected abstract void payOrder();

    protected abstract void doCookie();

    protected abstract void eat();
}
