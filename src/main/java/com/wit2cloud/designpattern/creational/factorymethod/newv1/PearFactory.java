package com.wit2cloud.designpattern.creational.factorymethod.newv1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: PearFactory
 * @Desc: TODO
 * @history v1.0
 */
public class PearFactory extends FruitFactory{
    @Override
    public Fruit createFruit() {
        return new AppleFruit(1004L,"梨子");
    }
}
