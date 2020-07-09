package com.wit2cloud.designpattern.behavioral.mediator.v1;
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
public abstract class AbstractDatabase {

    public final  static String _ORACLE = "ORACLE";
    public final  static String _ES = "ES";
    public final  static String _REDIS = "REDIS";


    public abstract void save(String data);

    public abstract void sync(String data);

    public abstract void receive(String data);

}
