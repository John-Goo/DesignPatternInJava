package com.wit2cloud.designpattern.creational.builder.t1.old;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Car
 * @Desc: 家庭小轿车
 * @history v1.0
 */
public class Car {
    private String engine;
    private String bodyStyle;
    private String seats;
    private String wheel;
    private String windows;
    private String carType;

    public Car(String carType){
        this.carType = carType;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }



    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", seats='" + seats + '\'' +
                ", wheel='" + wheel + '\'' +
                ", windows='" + windows + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

}
