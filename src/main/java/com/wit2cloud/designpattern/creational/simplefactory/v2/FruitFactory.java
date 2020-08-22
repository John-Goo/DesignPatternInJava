package com.wit2cloud.designpattern.creational.simplefactory.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: FruitFactory
 * @Desc: TODO
 * @history v1.0
 */
// SimpleFactory
public class FruitFactory {
    /**
     * 简单工厂静态方法
     */
    public static Fruit createFruit(String fruitType){
        Fruit fruit = null;
        switch (fruitType){
            case "apple" :
                fruit = new AppleFruit(1001L,"苹果");
                break;
            case "banana":
                fruit = new BananaFruit(1002L,"香蕉");
                break;
            case "orange":
                fruit = new OrangeFruit(1003L,"橘子");
                break;
        }
       return  fruit;
    }

}
