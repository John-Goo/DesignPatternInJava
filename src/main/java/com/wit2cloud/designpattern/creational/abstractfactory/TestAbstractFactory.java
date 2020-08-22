package com.wit2cloud.designpattern.creational.abstractfactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestAbstractFactory
 * @Desc: TODO
 * @history v1.0
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFruitFactory t1 = FruitFactoryClient.createFactory("T1");
        AbstractFruitFactory t2 = FruitFactoryClient.createFactory("T2");
        // 获取T2农场，苹果
        Fruit fruit =  t2.createFruit("apple");
        System.out.println(fruit);
        // 获取T1农场，橘子
        fruit =  t1.createFruit("orange");
        System.out.println(fruit);

        // 获取T1农场，苹果
        fruit =  t1.createFruit("apple");
        System.out.println(fruit);



    }
}
