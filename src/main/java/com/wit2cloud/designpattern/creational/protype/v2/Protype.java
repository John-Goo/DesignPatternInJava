package com.wit2cloud.designpattern.creational.protype.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Protype
 * @Desc: TODO
 * @history v1.0
 */
public class Protype implements Cloneable {
    @Override
    protected AccessControl clone() throws CloneNotSupportedException {
        return (AccessControl) super.clone();
    }
}
