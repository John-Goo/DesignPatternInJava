package com.wit2cloud.designpattern.creational.builder.t1.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/


/**
 * @author John Goo
 * @version 1.0
 * @ClassName: CarConstructUtil
 * @Desc: 生产福特车型
 * @history v1.0
 */
public class FordCarUtil {

    public static void buildBodyStyle(Car car) {
        car.setBodyStyle("福特车-建造车身风格");
    }

    public static void buildSeats(Car car) {
        car.setSeats("福特车-建造车内座位");
    }

    public static void buildWindows(Car car) {
        car.setWindows("福特车-建造车窗");
    }

    public static void buildWheel(Car car) {
        car.setWheel("福特车-建造车轮");

    }

    public static void buildEngine(Car car) {
        car.setEngine("福特车-建造发动机");
    }



}
