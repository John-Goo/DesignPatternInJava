package com.wit2cloud.designpattern.structural.proxy.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: HelloProxy
 * @Desc: TODO
 * @history v1.0
 */
public class HelloProxy implements HelloInterface {

    private HelloInterface helloInterface;

    public HelloProxy(HelloInterface helloInterface) {
        this.helloInterface = helloInterface;
    }

    @Override
    public void hi(String msg) {
        System.out.println("{HelloProxy }代理执行before："+msg);
        helloInterface.hi(msg);
        System.out.println("{HelloProxy }代理执行after："+msg);
    }
}
