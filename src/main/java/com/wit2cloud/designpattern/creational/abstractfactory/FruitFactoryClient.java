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
 * @Desc: TODO
 * @history v1.0
 */
public class FruitFactoryClient {

    public static AbstractFruitFactory createFactory(String factoryType) {
        AbstractFruitFactory factory = null;
        switch (factoryType) {
            case "T1":
                factory = new T1FruitFactory();
                break;
            case "T2":
                factory = new T2FruitFactory();
                break;
        }
        return factory;
    }


}
