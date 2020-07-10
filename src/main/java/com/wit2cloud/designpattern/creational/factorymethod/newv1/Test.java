package com.wit2cloud.designpattern.creational.factorymethod.newv1;
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
        /*
        * 面向扩展开放，面向修改关闭
        *
        * */
        Fruit fruit = null;
        FruitFactory fruitFactory = new AppleFactory();
        fruit = fruitFactory.createFruit();
        System.out.println(fruit);
        //缺点：要增加很多工厂类
        fruitFactory = new BananaFactory();
        fruit = fruitFactory.createFruit();
        System.out.println(fruit);
        fruitFactory = new OranageFactory();
        fruit =  fruitFactory.createFruit();
        System.out.println(fruit);
        fruitFactory = new PearFactory();
        fruit =  fruitFactory.createFruit();
        System.out.println(fruit);



    }
}
