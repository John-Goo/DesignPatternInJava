package com.wit2cloud.designpattern.creational.factorymethod;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Consumer
 * @Desc: 消费者
 * @history v1.0
 */
public class DriverTest {
    public static void main(String[] args) {
        SensorSimpleFactory simpleFactory = new SensorSimpleFactory();
        // 消费者使用的是哪个工厂生产的优传感器
        Consumer consumer = new Consumer(simpleFactory);
        consumer.useSensor("red");

    }

}
