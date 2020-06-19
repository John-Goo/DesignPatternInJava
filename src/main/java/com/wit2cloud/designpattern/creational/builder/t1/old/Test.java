package com.wit2cloud.designpattern.creational.builder.t1.old;
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
        // 比亚迪车建造过程
        Car byd = new Car("BYD");
        BYDCarUtil.buildBodyStyle(byd);
        BYDCarUtil.buildEngine(byd);
        BYDCarUtil.buildSeats(byd);
        BYDCarUtil.buildWheel(byd);
        BYDCarUtil.buildWindows(byd);
        System.out.println("车型："+byd);

        // 福特车建造过程
        Car ford = new Car("FORD");
        BYDCarUtil.buildBodyStyle(ford);
        BYDCarUtil.buildEngine(ford);
        BYDCarUtil.buildSeats(ford);
        BYDCarUtil.buildWheel(ford);
        BYDCarUtil.buildWindows(ford);
        System.out.println("车型："+ford);

    }
}
