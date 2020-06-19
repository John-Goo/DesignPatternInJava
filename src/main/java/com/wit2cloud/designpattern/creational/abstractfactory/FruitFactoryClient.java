package com.wit2cloud.designpattern.creational.abstractfactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: FruitFactoryClient
 * @Desc: 获取具体的种植果园工厂
 * @history v1.0
 */
public class FruitFactoryClient {


    /**
     * 获取具体的种植工厂
     * @param facType
     * @return
     */
    public static AbstractFruitFactory getFruitFactory(String facType) {
        switch (facType){
            case "T1":return new T1FruitFactory();
            case "T2":return new T2FruitFactory();
        }
        return null;
    }
}
