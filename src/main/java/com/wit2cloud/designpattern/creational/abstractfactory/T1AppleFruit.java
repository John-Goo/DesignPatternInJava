package com.wit2cloud.designpattern.creational.abstractfactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Apple
 * @Desc: 苹果树
 * @history v1.0
 */
public class T1AppleFruit implements Fruit {
    @Override
    public void plant() {
        System.out.println("[工厂名称：T1] 水果==>种植苹果树.");
    }

    @Override
    public void water() {
        System.out.println("[工厂名称：T1] 水果==>给苹果树浇水施肥.");
    }

    @Override
    public void pick() {
        System.out.println("[工厂名称：T1] 水果==>采摘苹果.");
    }

}