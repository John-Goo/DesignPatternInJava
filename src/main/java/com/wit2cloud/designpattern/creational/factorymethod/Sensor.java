package com.wit2cloud.designpattern.creational.factorymethod;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Sensor
 * @Desc: 传感器抽象父类
 * @history v1.0
 */
public abstract class Sensor{

    /**
     * 传感器开关打开
     */
    public abstract void turnon();

    /**
     *  传感器开关关闭
     */
    public abstract  void trunoff();

    /**
     * 设置传感器参数
     * @param parameter
     */
    public abstract  void set(Object parameter);



}
