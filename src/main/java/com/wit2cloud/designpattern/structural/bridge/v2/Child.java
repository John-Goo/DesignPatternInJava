package com.wit2cloud.designpattern.structural.bridge.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Child
 * @Desc: TODO
 * @history v1.0
 */
public class Child extends Parent {
    @Override
    public int price() {
        return super.price()+10;
    }

    public static void main(String[] args) {
         Child c = new Child();
         int cPrice = c.price();
         System.out.println(cPrice);
    }
}
