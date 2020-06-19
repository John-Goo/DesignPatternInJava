package com.wit2cloud.designpattern.creational.abstractfactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AbstractTFactory
 * @Desc: 抽象工厂
 * @history v1.0
 */
public abstract class AbstractFruitFactory {

    /**
     *  获取水果树实例接口
     * @param type
     * @return  Fruit
     */
    public abstract Fruit createFruit(String type);


    public void operate(String type){
        Fruit fruit = createFruit(type);
        fruit.plant();
        fruit.water();
        fruit.pick();
    }


}
