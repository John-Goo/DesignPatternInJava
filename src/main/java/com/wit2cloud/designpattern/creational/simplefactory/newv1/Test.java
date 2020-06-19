package com.wit2cloud.designpattern.creational.simplefactory.newv1;
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
        //Fruit[]  array = {new AppleFruit(),new BananaFruit(),new OrangeFruit()};

        /**
         * 遍历所有的种植水果
         */
        String[] array = {"apple","banana","orange"};
        Fruit fruit = null;
        for (String f:array) {
            if("apple".equals(f)){
                fruit = new AppleFruit();
            }else if ("banana".equals(f)){
                fruit = new BananaFruit();
            }else if ("orange".equals(f)){
                fruit = new OrangeFruit();
            }else {
                System.out.println(" 水果类型不存在！");
                continue;
            }
            fruit.plant();
            fruit.water();
            fruit.pick();
        }

        /**
         * 操作橘子树
         */
        System.out.println(" === 操作橘子树===");
        Fruit orange = new OrangeFruit();
        fruit.plant();
        fruit.water();
        fruit.pick();

    }
}
