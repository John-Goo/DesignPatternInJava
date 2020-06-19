package com.wit2cloud.designpattern.creational.factorymethod.newv1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: OranageFactory
 * @Desc: 橘子工厂
 * @history v1.0
 */
public class OranageFactory extends FruitFactory{
    @Override
    public Fruit createFruit() {
        return new OrangeFruit();
    }
}
