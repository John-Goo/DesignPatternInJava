package com.wit2cloud.designpattern.creational.simplefactory.newv2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: OrangeFruit
 * @Desc: 香蕉树
 * @history v1.0
 */
public class PearFruit implements Fruit {
    @Override
    public void plant() {
        System.out.println("水果==>种植梨树.");
    }

    @Override
    public void water() {
        System.out.println("水果==>给梨树浇水施肥.");
    }

    @Override
    public void pick() {
        System.out.println("水果==>采摘梨.");
    }
}
