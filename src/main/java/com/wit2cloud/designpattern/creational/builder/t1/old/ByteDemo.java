package com.wit2cloud.designpattern.creational.builder.t1.old;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: ByteDemo
 * @Desc: TODO
 * @history v1.0
 */
public class ByteDemo {
    private volatile String str;

    public void modify(String str1){
        synchronized (str1){
            str1 = "hello,world!";
        }
    }
}
