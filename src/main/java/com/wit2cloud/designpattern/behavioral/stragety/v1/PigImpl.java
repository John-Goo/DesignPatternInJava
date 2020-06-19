package com.wit2cloud.designpattern.behavioral.stragety.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: PigImpl
 * @Desc: TODO
 * @history v1.0
 */
public class PigImpl implements AnimalInterface{
    @Override
    public void weight() {
        System.out.println("[动物 Pig] 体重范围0.1~200kg.");
    }

    @Override
    public void colorStyle() {
        System.out.println("[动物 Pig] 颜色主体是白色.");
    }

    @Override
    public void isFly() {
        System.out.println("[动物 Pig] 不会飞行，爬行动物.");
    }

    @Override
    public void eatFood() {
        System.out.println("[动物 Pig] 主要吃睡到、小表...");
    }
}
