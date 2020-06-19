package com.wit2cloud.designpattern.behavioral.template;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: CabbageFood
 * @Desc: TODO
 * @history v1.0
 */
public class CabbageFood extends OrderTmeplate {
    @Override
    protected void payOrder() {
        System.out.println(" **支付了白菜饭.");

    }

    @Override
    protected void doCookie() {
        System.out.println(" **厨师开始做白菜饭.");
    }

    @Override
    protected void eat() {
        System.out.println(" **我吃白菜饭.");
    }
}
