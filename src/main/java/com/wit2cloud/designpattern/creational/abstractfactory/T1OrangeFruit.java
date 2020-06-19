package com.wit2cloud.designpattern.creational.abstractfactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: OrangeFruit
 * @Desc: 橘子树
 * @history v1.0
 */
public class T1OrangeFruit implements Fruit {
    @Override
    public void plant() {

        System.out.println("[工厂名称：T1] 水果==>种植橘子树.");
    }

    @Override
    public void water() {

        System.out.println("[工厂名称：T1] 水果==>给橘子树浇水施肥.");
    }

    @Override
    public void pick() {
        System.out.println("[工厂名称：T1] 水果==>采摘橘子.");
    }
}