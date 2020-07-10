package com.wit2cloud.designpattern.creational.simplefactory.newv2;
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

        /**
         * 遍历所有的种植水果
         */
        String[] fruitTypes = {"apple", "banana", "orange"};
        Fruit[] fruits = new Fruit[3];
        for (int i = 0; i < fruitTypes.length; i++) {
            String type = fruitTypes[i];
            Fruit fruit = SimpleFactory.createFruit(type);
            fruits[i] = fruit;
            System.out.println(fruit);
        }
        Fruit fruit = SimpleFactory.createFruit("pear");
        System.out.println(fruit);


    }
}
