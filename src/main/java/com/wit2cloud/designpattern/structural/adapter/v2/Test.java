package com.wit2cloud.designpattern.structural.adapter.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {
    public static void main(String[] args) {
        // x公司支持接口
        XPay xPay = new XPayImpl();
        xPay.setCreditCardNo("577888787878");
        xPay.setCustomerName("John Goo");
        xPay.setCardExpMonth("07");
        xPay.setCardExpYear("36");
        xPay.setCardCVVNo((short)456);
        xPay.setAmount(55.0);

        // y公司接口，需要x公司的接口来进行适配转换
        YPay yPay = new XPay2YPayAdapter(xPay);
        System.out.println("转换前XPay接口数据："+xPay);
        System.out.println("转换后XPay接口数据："+yPay);

    }
}
