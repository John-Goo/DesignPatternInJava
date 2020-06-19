package com.wit2cloud.designpattern.structural.proxy.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import com.sun.javafx.scene.text.HitInfo;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: HiImpl
 * @Desc: TODO
 * @history v1.0
 */
public class HelloImpl implements HelloInterface {
    @Override
    public void hi(String msg) {
        System.out.println(" {HelloInterface--> HelloImpl } :"+msg);
    }
}
