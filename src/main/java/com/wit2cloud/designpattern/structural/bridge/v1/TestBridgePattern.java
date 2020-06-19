package com.wit2cloud.designpattern.structural.bridge.v1;
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
        SystemPlatform windows = new Windows("Window7");
        SupplyApp myApp = new SupplyApp(windows,"SupplyApp供应链系统");
        myApp.codeCompile();
        myApp.busiOperate();

        WebApp myApp2 = new WebApp(windows,"WebApp系统");
        myApp2.codeCompile();
        myApp2.busiOperate();

        SystemPlatform centos = new Linux("centos7");
        SupplyApp myApp3 = new SupplyApp(centos,"SupplyApp供应链系统");
        myApp3.codeCompile();
        myApp3.busiOperate();
        myApp3.display();

        WebApp myApp4 = new WebApp(centos,"WebApp系统");
        myApp4.codeCompile();
        myApp4.busiOperate();
    }
}
