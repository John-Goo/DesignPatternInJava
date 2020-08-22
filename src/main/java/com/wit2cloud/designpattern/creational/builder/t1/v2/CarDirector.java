package com.wit2cloud.designpattern.creational.builder.t1.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/


/**
 * @author John Goo
 * @version 1.0
 * @ClassName: CarDirector
 * @Desc: TODO
 * @history v1.0
 */
public class CarDirector {


    /**
     * 指挥建造过程的工序、步骤或流程
     * @param carBuilder
     * @return
     */
    public Car construct(CarBuilder carBuilder){
        carBuilder.buildBodyStyle();
        carBuilder.buildEngine();
        carBuilder.buildSeats();
        carBuilder.buildWheel();
        carBuilder.buildWindows();
        return  carBuilder.getCar();
    }

}
