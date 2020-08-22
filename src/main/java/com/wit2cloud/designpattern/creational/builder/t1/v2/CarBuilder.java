package com.wit2cloud.designpattern.creational.builder.t1.v2;


/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface CarBuilder {

    public void buildEngine();

    public void buildSeats();

    public void buildWheel();

    public void buildWindows();

    public void buildBodyStyle();

    public  Car getCar();
}
