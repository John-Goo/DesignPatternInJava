package com.wit2cloud.designpattern.creational.factorymethod;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: FruitFactory
 * @Desc: TODO
 * @history v1.0
 */
// FactoryMethod
public abstract class FruitFactory {


    /**
     * 定义创建实例接口
     * @return
     */
    public abstract Fruit createFruit();

}
