package com.wit2cloud.designpattern.structural.bridge.v2;
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
public class WebApp extends MyApp {

    public WebApp(SystemPlatform platform, String appType) {
        super(platform, appType);
    }

    @Override
    void codeCompile() {
        platform.load();
        System.out.println("应用类型："+appType+",重新编译了代码，所执行的平台："+platform.getProductName());
    }

    @Override
    void busiOperate() {
        platform.execute();
        System.out.println("应用类型："+appType+",更新过代码，所执行的平台："+platform.getProductName());
    }


}
