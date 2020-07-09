package com.wit2cloud.designpattern.behavioral.mediator.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AbstractDatabase
 * @Desc: TODO
 * @history v1.0
 */
public  interface  Mediator {

    public final  static String _ORACLE = "oracle";
    public final  static String _ES = "es";
    public final  static String _REDIS = "redis";

    public  void sync(String databaseType,String data);



}
