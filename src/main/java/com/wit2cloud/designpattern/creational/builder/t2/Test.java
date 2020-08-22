package com.wit2cloud.designpattern.creational.builder.t2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {
    public static void main(String[] args) {
        Form form = Form.builder()
                .name("John Goo")
                .email("John@hotmail.com")
                .job("John@hotmail.com")
                .addr("深圳")
                .build();
        System.out.println(form);
    }
}
