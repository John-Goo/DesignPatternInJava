package com.wit2cloud.designpattern.behavioral.stragety.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import com.wit2cloud.designpattern.behavioral.stragety.v1.AnimalInterface;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: DuckImpl
 * @Desc: TODO
 * @history v1.0
 */
public class DuckStrategy implements AnimalStrategy{
    @Override
    public void weight() {
        System.out.println("[动物 Duck] 体重范围0.1~10kg.");
    }

    @Override
    public void colorStyle() {
        System.out.println("[动物 Duck] 颜色主体是白色.");
    }

    @Override
    public void isFly() {
        System.out.println("[动物 Duck] 不会飞行，爬行+游行动物.");
    }

    @Override
    public void eatFood() {
        System.out.println("[动物 Duck] 主要吃睡到、小表...");
    }
}
