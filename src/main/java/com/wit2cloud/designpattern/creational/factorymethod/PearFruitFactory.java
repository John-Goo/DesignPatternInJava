package com.wit2cloud.designpattern.creational.factorymethod;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: PearFruitFactory
 * @Desc: TODO
 * @history v1.0
 */
public class PearFruitFactory extends FruitFactory {
    @Override
    public Fruit createFruit() {
        return new PearFruit(1005L,"梨子");
    }
}
