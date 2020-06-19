package com.wit2cloud.designpattern.creational.builder.t1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import com.wit2cloud.designpattern.creational.builder.t1.old.Car;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: BydCarBuilder
 * @Desc: TODO
 * @history v1.0
 */
public class BYDCarBuilder implements CarBuilder{

    private Car car = new Car("BYD");
    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("比亚迪车-建造车身风格");
    }

    @Override
    public void buildSeats() {
        car.setSeats("比亚迪车-建造车内座位");
    }

    @Override
    public void buildWindows() {
        car.setWindows("比亚迪车-建造车窗");
    }

    @Override
    public void buildWheel() {
        car.setWheel("比亚迪车-建造车轮");

    }

    @Override
    public void buildEngine() {
        car.setEngine("比亚迪车-建造发动机");

    }



    @Override
    public Car getCar() {
        return car;
    }
}
