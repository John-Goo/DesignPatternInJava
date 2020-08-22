package com.wit2cloud.designpattern.creational.singleton;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestSingleton
 * @Desc: TODO
 * @history v1.0
 */
public class TestSingleton {
    public static void main(String[] args) {
        MySingleton.getInstance().put("1","book");
        MySingleton.getInstance().put("2","fruit");

        String val =  MySingleton.getInstance().get("2");
        System.out.println(val);
        val =  MySingleton.getInstance().get("1");
        System.out.println(val);
        System.out.println("== 演示地址是否一致 ==");
        System.out.println(MySingleton.getInstance());
        System.out.println(MySingleton.getInstance());

    }
}
