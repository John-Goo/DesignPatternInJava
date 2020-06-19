package com.wit2cloud.designpattern.creational.singleton;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/
public interface Prototype extends  Cloneable{

    public AccessControl clone() throws CloneNotSupportedException;
}
