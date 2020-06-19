package com.wit2cloud.designpattern.creational.builder.t1;

import com.wit2cloud.designpattern.creational.builder.t1.old.Car;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/
public interface CarBuilder {

    public void buildBodyStyle();
    public void buildSeats();
    public void buildWindows();
    public void buildWheel();
    public void buildEngine();

    public Car getCar();

}
