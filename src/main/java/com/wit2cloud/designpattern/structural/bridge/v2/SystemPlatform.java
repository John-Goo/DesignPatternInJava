package com.wit2cloud.designpattern.structural.bridge.v2;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface SystemPlatform {

    public String getProductName();

    public void load();

    public void execute();

}
