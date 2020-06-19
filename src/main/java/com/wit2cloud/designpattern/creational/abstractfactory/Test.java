package com.wit2cloud.designpattern.creational.abstractfactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {

    public static void main(String[] args) {
        AbstractFruitFactory factory1 = FruitFactoryClient.getFruitFactory("T1");
        //Fruit fruit1 = factory1.("apple");
        factory1.operate("apple");
        AbstractFruitFactory factory2 = FruitFactoryClient.getFruitFactory("T2");
        //Fruit fruit2 = factory2.createFruit("apple");
        factory2.operate("banana");
    }
}
