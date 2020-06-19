package com.wit2cloud.designpattern.behavioral.stragety.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestStrategy
 * @Desc: TODO
 * @history v1.0
 */
public class TestStrategy {
    public static void main(String[] args) {
        AnimalContext context = new AnimalContext(new DogStrategy());
        context.execute();
        System.out.println("----------------");
        context.switchContext(new CatStrategy());
        context.execute();
        System.out.println("----------------");
        context.switchContext(new DuckStrategy());
        context.execute();

        System.out.println("----------------");
        context.switchContext(new PigStrategy());
        context.execute();
    }
}
