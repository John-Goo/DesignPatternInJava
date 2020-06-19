package com.wit2cloud.designpattern.creational.simplefactory;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: WaterSensor
 * @Desc: 水感优越感
 * @history v1.0
 */
public class WaterSensor extends Sensor{
    @Override
    public void turnon() {
        System.out.println("[水感传感器]==> 开关已经打开.");
    }

    @Override
    public void trunoff() {
        System.out.println("[水感传感器]==> 开关已经关闭.");
    }

    @Override
    public void set(Object parameter) {
        System.out.println("[水感传感器]==> 设置参数："+parameter);
    }
}
