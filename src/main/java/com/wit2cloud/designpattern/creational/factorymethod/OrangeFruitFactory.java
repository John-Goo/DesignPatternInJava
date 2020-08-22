package com.wit2cloud.designpattern.creational.factorymethod;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AppleFruitFactory
 * @Desc: TODO
 * @history v1.0
 */
public class OrangeFruitFactory extends  FruitFactory{
    @Override
    public Fruit createFruit() {
        return new OrangeFruit(1003L,"橘子");
    }
}
