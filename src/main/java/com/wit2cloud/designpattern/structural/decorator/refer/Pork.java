package com.wit2cloud.designpattern.structural.decorator.refer;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Pork
 * @Desc: TODO
 * @history v1.0
 */
public class Pork extends SimplyNonVegPizza{

    private final Pizza pizza;


    public Pork(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+", Pork (8.75)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice()+8.75;
    }
}
