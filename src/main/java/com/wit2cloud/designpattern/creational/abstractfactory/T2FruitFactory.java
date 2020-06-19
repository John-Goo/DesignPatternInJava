package com.wit2cloud.designpattern.creational.abstractfactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: T1FruitFactory
 * @Desc: T2农场果园
 * @history v1.0
 */
public class T2FruitFactory extends AbstractFruitFactory{
    @Override
    public Fruit createFruit(String type) {
        Fruit fruit = null;
        switch (type) {
            case "apple":
                fruit = new T2AppleFruit();
                break;
            case "banana":
                fruit = new T2BananaFruit();
                break;
            case "orange":
                fruit = new T2OrangeFruit();
                break;
            default:
                System.out.println(" 水果类型不存在！");
        }
        return fruit;
    }
}
