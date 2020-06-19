package com.wit2cloud.designpattern.structural.bridge.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: WindowsPlatform
 * @Desc: TODO
 * @history v1.0
 */
public class Windows implements SystemPlatform {

    private String productName;

    public Windows(String productName) {
        this.productName = productName;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void load() {
        System.out.println("[Windows] "+ productName+"平台--->加载class文件.");
    }

    @Override
    public void execute() {
        System.out.println("[Windows] "+productName+"平台--->执行字节码文件.");
    }
}
