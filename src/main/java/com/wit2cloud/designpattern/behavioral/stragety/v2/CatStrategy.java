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
 * @ClassName: CatImpl
 * @Desc: TODO
 * @history v1.0
 */
public class CatStrategy implements AnimalStrategy{

    @Override
    public void weight() {
        System.out.println("[动物 Cat] 体重范围0.1~5kg.");
    }

    @Override
    public void colorStyle() {
        System.out.println("[动物 Cat] 颜色主体是黄色.");
    }

    @Override
    public void isFly() {
        System.out.println("[动物 Cat] 不会飞行，爬行动物.");
    }

    @Override
    public void eatFood() {
        System.out.println("[动物 Cat] 主要吃老鼠、鱼...");
    }
}
