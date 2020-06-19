package com.wit2cloud.designpattern.structural.decorator.refer;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: FamilyBucketPizza
 * @Desc: TODO
 * @history v1.0
 */
public class FamilyBucketPizza implements Pizza{

    @Override
    public String getDesc() {
        return "FamilyBucketPizza (600)";
    }

    @Override
    public double getPrice() {
        return 600;
    }
}
