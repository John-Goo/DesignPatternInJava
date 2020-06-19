package com.wit2cloud.designpattern.behavioral.stragety.v1;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface AnimalInterface {

    /**
     *  动物重量
     */
    public void weight();

    /**
     * 动物形貌
     */
    public void colorStyle();

    /**
     * 动物是否会飞
     */
    public void isFly();
    /**
     * 动物吃什么食物
     */
    public void eatFood();
}
