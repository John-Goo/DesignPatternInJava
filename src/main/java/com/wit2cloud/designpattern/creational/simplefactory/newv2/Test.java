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
        SimpleFactory sf = new SimpleFactory();

        /**
         * 遍历所有的种植水果
         */
        String[] array = {"apple","banana","orange"};
        Fruit fruit = null;
        for (String f:array) {
            sf.newInstance(f).display();
        }

        /**
         * 操作橘子树
         */
        System.out.println(" === 操作橘子树===");
       /* Fruit orange = sf.createFruit("orange");*/
        sf.newInstance("orange").display();

    }
}
