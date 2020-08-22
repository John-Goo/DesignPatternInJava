package com.wit2cloud.designpattern.creational.abstractfactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/


/**
 * @author John Goo
 * @version 1.0
 * @ClassName: T1FruitFactory
 * @Desc: TODO
 * @history v1.0
 */
public class T1FruitFactory implements AbstractFruitFactory{
    @Override
    public Fruit createFruit(String fruitType) {
        Fruit fruit = null;
        switch (fruitType){
            case "apple" :
                fruit = new T1AppleFruit(1001L,"苹果");
                break;
            case "banana":
                fruit = new T1BananaFruit(1002L,"香蕉");
                break;
            case "orange":
                fruit = new T1OrangeFruit(1003L,"桔子");
                break;
        }
        return  fruit;
    }
}
