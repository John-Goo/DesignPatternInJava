package com.wit2cloud.designpattern.creational.builder.t1.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: BydCarBuilder
 * @Desc: 比亚迪车组装过程
 * @history v1.0
 */
public class BydCarBuilder implements CarBuilder {

    private Car car = new Car("BYD");
    private String factoryName = "比亚迪车";

    public void buildBodyStyle() {
        car.setBodyStyle(factoryName + "-建造车身风格");
    }


    public Car getCar() {
        return car;
    }

    public void buildSeats() {
        car.setSeats(factoryName + "-建造车内座位");
    }

    public void buildWindows() {
        car.setWindows(factoryName + "-建造车窗");
    }

    public void buildWheel() {
        car.setWheel(factoryName + "-建造车轮");

    }

    public void buildEngine() {
        car.setEngine(factoryName + "-建造发动机");
    }
}
