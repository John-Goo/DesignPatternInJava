package com.wit2cloud.designpattern.creational.factorymethod.newv1;
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
        /*
        * 面向扩展开放，面向修改关闭
        *
        * */
        FruitFactory appleFactory = new AppleFactory();
        appleFactory.display();
        FruitFactory bananaFactory = new BananaFactory();
        bananaFactory.display();
        FruitFactory oranageFactory = new OranageFactory();
        oranageFactory.display();
        //appleFriut.plant();
       // appleFriut.eat();


    }
}
