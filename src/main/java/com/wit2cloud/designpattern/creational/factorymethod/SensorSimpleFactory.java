package com.wit2cloud.designpattern.creational.factorymethod;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: SensorSimpleFactory
 * @Desc: 简单工厂
 * @history v1.0
 */
public class SensorSimpleFactory {

    public Sensor build(String sensorType){
        Sensor sensor = null;
        if("red".equals(sensorType)){
            sensor =  new RedSensor();
        }else if("smoking".equals(sensorType)){
            sensor =  new SmokingSensor();
        }
        else if("water".equals(sensorType)){
            sensor =  new WaterSensor();
        }else {
            return null;
        }
        return sensor;
    }


}
