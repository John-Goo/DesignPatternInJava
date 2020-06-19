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
 * @Desc: TODO
 * @history v1.0
 */
public class Consumer {
    private SensorSimpleFactory simpleFactory;

    public Consumer(SensorSimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }

    public void useSensor(String type){
       Sensor sensor =   simpleFactory.build(type);
       sensor.turnon();
       sensor.set("设置灵敏度及距离");
       sensor.trunoff();
    }

}
