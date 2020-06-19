package com.wit2cloud.designpattern.creational.builder.t2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: 演示builder建造设计模式的另外一种
 * @history v1.0
 */
public class Test {
    public static void main(String[] args) {
        Form form = Form.builder()
                .name("John Goo")
                .address("sz")
                .email("email@126.com")
                .job("IT")
                .build();
        System.out.println(form);
    }
}
