package com.wit2cloud.designpattern.creational.factorymethod;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: RedSensor
 * @Desc: 红外传感器
 * @history v1.0
 */
public class RedSensor extends Sensor {
    @Override
    public void turnon() {
        System.out.println("[红外传感器]==> 开关已经打开.");
    }

    @Override
    public void trunoff() {
        System.out.println("[红外传感器]==> 开关已经关闭.");
    }

    @Override
    public void set(Object parameter) {
        System.out.println("[红外传感器]==> 设置参数："+parameter);
    }
}
