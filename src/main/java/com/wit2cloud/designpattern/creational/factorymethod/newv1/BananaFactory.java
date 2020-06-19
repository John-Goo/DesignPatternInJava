package com.wit2cloud.designpattern.creational.factorymethod.newv1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: BananaFactory
 * @Desc: 香蕉工厂
 * @history v1.0
 */
public class BananaFactory extends FruitFactory{
    @Override
    public Fruit createFruit() {
        return new BananaFruit();
    }
}
