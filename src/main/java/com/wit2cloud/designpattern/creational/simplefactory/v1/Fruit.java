package com.wit2cloud.designpattern.creational.simplefactory.v1;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/
// Product接口
public interface Fruit {
    /**
     * 种植水果树
     */
    public void plant();

    /**
     * 浇水施肥
     */
    public void water();

    /**
     * 采摘水果
     */
    public void pick();


}
