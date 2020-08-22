package com.wit2cloud.designpattern.creational.factorymethod;
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
public class TestFactoryMethod {
    public static void main(String[] args) {
        /*
        * 创建某种产品，只需要知道是具体的工厂即可
        * */
        FruitFactory fruitFactory = new AppleFruitFactory();
        Fruit fruit = fruitFactory.createFruit();
        System.out.println(fruit);
        fruitFactory = new OrangeFruitFactory();
        fruit = fruitFactory.createFruit();

        System.out.println(fruit);
        fruitFactory = new BananaFruitFactory();
        fruit = fruitFactory.createFruit();
        System.out.println(fruit);

        fruitFactory = new PearFruitFactory();
        fruit = fruitFactory.createFruit();
        System.out.println(fruit);


    }
}
