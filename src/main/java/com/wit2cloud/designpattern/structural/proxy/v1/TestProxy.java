package com.wit2cloud.designpattern.structural.proxy.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestProxy
 * @Desc: 测试代理类的工作过程
 * @history v1.0
 */
public class TestProxy {
    public static void main(String[] args) {
        HelloInterface hello = new HelloImpl();
        HelloInterface  proxy = new HelloProxy(hello);
        proxy.hi("John Goo");
        System.out.println("----------------------");
        hello.hi("Tony");


    }
}
