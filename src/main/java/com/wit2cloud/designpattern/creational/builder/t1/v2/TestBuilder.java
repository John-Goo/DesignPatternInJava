package com.wit2cloud.designpattern.creational.builder.t1.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestBuilder
 * @Desc: TODO
 * @history v1.0
 */
public class TestBuilder {

    public static void main(String[] args) {
        // 建造福特车
        CarDirector director = new CarDirector();
        Car car = director.construct(new FordCarBuilder());
        System.out.println(car);

        car = director.construct(new BydCarBuilder());
        System.out.println(car);

    }
}
