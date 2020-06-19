package com.wit2cloud.designpattern.creational.builder.t1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import com.wit2cloud.designpattern.creational.builder.t1.old.Car;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {
    public static void main(String[] args) {
        // 针对接口编程，面向扩展开放，面向修改关闭
        // 实现表示与复杂实现（算法）相分离
        // 前端调用简单，用户使用透明原则，不需要了解具体的实现细节
        CarDirector director = new CarDirector();
        Car bydCar = director.construct(new BYDCarBuilder());
        System.out.println("（1）建造车型："+bydCar);
        CarDirector director2 = new CarDirector();
        Car fordCar = director2.construct(new FordCarBuilder());
        System.out.println("（1）建造车型："+fordCar);

    }
}
