package com.wit2cloud.designpattern.creational.simplefactory.v2;
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
public class TestSimpleFactory {
    public static void main(String[] args) {
        //Fruit[]  array = {new AppleFruit(),new BananaFruit(),new OrangeFruit()};

        /**
         * 遍历所有的种植水果
         */
        String[] array = {"apple","banana","orange"};
        Fruit[] fruits = new Fruit[3];
        for (int i=0;i<array.length;i++) {
            Fruit fruit = FruitFactory.createFruit(array[i]);
            fruits[i] = fruit;
            System.out.println(fruit);
            fruit.plant();
            fruit.water();
            fruit.pick();
        }

        /**
         * 操作橘子树
         */
        System.out.println(" === 操作橘子树===");
        Fruit orange = FruitFactory.createFruit("orange");
        System.out.println(orange);
        orange.plant();
        orange.water();
        orange.pick();

    }
}
