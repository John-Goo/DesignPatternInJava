package com.wit2cloud.designpattern.structural.bridge.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: MyApp
 * @Desc: TODO
 * @history v1.0
 */
public abstract class MyApp {

    protected SystemPlatform platform;
    protected String appType;

    public MyApp(SystemPlatform platform, String appType) {
        this.platform = platform;
        this.appType = appType;
    }

    abstract void codeCompile();

    abstract void busiOperate();

    public void display(){
        System.out.println("[display] 平台："+platform.getProductName()+","+"应用类型："+appType);
    }
}
