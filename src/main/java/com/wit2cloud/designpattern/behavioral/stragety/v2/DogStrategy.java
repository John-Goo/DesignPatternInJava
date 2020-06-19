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
 * @ClassName: DogImpl
 * @Desc: TODO
 * @history v1.0
 */
public class DogStrategy implements AnimalStrategy {

    @Override
    public void weight() {
        System.out.println("[动物 Dog] 体重范围0.1~20kg.");
    }

    @Override
    public void colorStyle() {
        System.out.println("[动物 Dog] 颜色主体是黑色.");
    }

    @Override
    public void isFly() {
        System.out.println("[动物 Dog] 不会飞行，爬行动物.");
    }

    @Override
    public void eatFood() {
        System.out.println("[动物 Dog] 主要吃骨头、肉...");
    }
}
