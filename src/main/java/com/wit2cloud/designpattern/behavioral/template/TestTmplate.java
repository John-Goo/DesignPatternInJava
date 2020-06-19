package com.wit2cloud.designpattern.behavioral.template;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestTmplate
 * @Desc: TODO
 * @history v1.0
 */
public class TestTmplate {
    public static void main(String[] args) {
        OrderTmeplate tmeplate = new EggFood();
        tmeplate.process();
        System.out.println("----------------");
        tmeplate = new MeatFood();
        tmeplate.process();
        System.out.println("----------------");
        tmeplate = new CabbageFood();
        tmeplate.process();


    }
}
