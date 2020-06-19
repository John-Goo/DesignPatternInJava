package com.wit2cloud.designpattern.structural.bridge.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: SupplyApp
 * @Desc: TODO
 * @history v1.0
 */
public class WebApp  {
    private SystemPlatform platform;
    private String appType;

    public WebApp(SystemPlatform platform, String appType) {
        this.platform = platform;
        this.appType = appType;
    }

    void codeCompile() {
        platform.load();
        System.out.println("应用类型："+appType+",重新编译了代码，所执行的平台："+platform.getProductName());
    }

    void busiOperate() {
        platform.execute();
        System.out.println("应用类型："+appType+",更新过代码，所执行的平台："+platform.getProductName());
    }

    public void display(){
        System.out.println("[display] 平台："+platform.getProductName()+","+"应用类型："+appType);
    }

}
