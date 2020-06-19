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
 * @ClassName: CarDirector
 * @Desc: TODO
 * @history v1.0
 */
public class CarDirector {
    /**
     * 原型设计模式中应用了深克隆与浅克隆，那么这两者是怎么区别的，分别
     * 应用什么场景及优缺点？
     * @param builder
     * @return
     */

    public Car construct(CarBuilder builder){
        builder.buildBodyStyle();
        builder.buildEngine();
        builder.buildSeats();
        builder.buildWheel();
        builder.buildWindows();
        return builder.getCar();
    }
}
