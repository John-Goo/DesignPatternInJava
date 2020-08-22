package com.wit2cloud.designpattern.creational.abstractfactory;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface AbstractFruitFactory {

    public Fruit createFruit(String fruitType);
}
