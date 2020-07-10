package com.wit2cloud.designpattern.creational.simplefactory.newv2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: SimpleFactory
 * @Desc: 统一产生实例对象
 * @history v1.0
 */
public class SimpleFactory {


    public static Fruit createFruit(String type) {
        Fruit fruit = null;
        switch (type) {
            case "apple":
                fruit = new AppleFruit(1001L,"苹果");
                break;
            case "banana":
                fruit = new BananaFruit(1002L,"香蕉");
                break;
            case "orange":
                fruit = new OrangeFruit(1003L,"桔子");
                break;
            case "pear":
                fruit = new PearFruit();
                break;
            default:
                System.out.println(" 水果类型不存在！");
        }
        return fruit;
    }


}
