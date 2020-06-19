package com.wit2cloud.designpattern.creational.builder.t2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test1
 * @Desc: TODO
 * @history v1.0
 */
public class Test1 {

    public static void main(String[] args) {
        MyClient client = ConnectFactory.builder()
                .ip("192.169.0.1")
                .port("8080")
                .author(null)
                .usrName("john")
                .password("123456")
                .build();
        client.send("hello");
    }


}
