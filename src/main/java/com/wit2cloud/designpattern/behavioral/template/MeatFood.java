package com.wit2cloud.designpattern.behavioral.template;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: MeatFood
 * @Desc: TODO
 * @history v1.0
 */
public class MeatFood extends OrderTmeplate{
    @Override
    protected void payOrder() {
        System.out.println(" **支付了回锅肉饭.");

    }

    @Override
    protected void doCookie() {
        System.out.println(" **厨师开始做回锅肉饭.");
    }

    @Override
    protected void eat() {
        System.out.println(" **我吃回锅肉饭.");
    }
}
