package com.wit2cloud.designpattern.creational.simplefactory.v1;
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
                fruit = new AppleFruit(1001L,"苹果");
            }else if ("banana".equals(f)){
                fruit = new BananaFruit(1002L,"香蕉");
            }else if ("orange".equals(f)){
                fruit = new OrangeFruit(1003L,"桔子");
            }else {
                System.out.println(" 水果类型不存在！");
                continue;
            }
            System.out.println(fruit);
            fruit.plant();
            fruit.water();
            fruit.pick();
        }

        /**
         * 操作橘子树
         */
        System.out.println(" === 操作橘子树===");
        Fruit orange = new OrangeFruit(1004l,"橘子");
        fruit.plant();
        fruit.water();
        fruit.pick();

    }
}
