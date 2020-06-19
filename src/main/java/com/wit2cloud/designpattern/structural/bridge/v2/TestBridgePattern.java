package com.wit2cloud.designpattern.structural.bridge.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestBridgePattern
 * @Desc: TODO
 * @history v1.0
 */
public class TestBridgePattern {
    public static void main(String[] args) {
        // 定义抽象父类
        MyApp myApp = null;
        SystemPlatform windows = new Windows("Window7");
        myApp = new SupplyApp(windows,"SupplyApp供应链系统");
        myApp.codeCompile();
        myApp.busiOperate();
        myApp.display();

        myApp = new WebApp(windows,"WebApp系统");
        myApp.codeCompile();
              myApp.busiOperate();
        myApp.display();

        SystemPlatform centos = new Linux("centos7");
        myApp = new SupplyApp(centos,"SupplyApp供应链系统");
        myApp.codeCompile();
        myApp.busiOperate();
        myApp.display();

        myApp = new WebApp(centos,"WebApp系统");
        myApp.codeCompile();
        myApp.busiOperate();
        myApp.display();
    }
}
