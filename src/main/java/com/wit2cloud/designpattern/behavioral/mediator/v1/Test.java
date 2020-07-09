package com.wit2cloud.designpattern.behavioral.mediator.v1;
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
        OracleDatabase oracle = new OracleDatabase();
        RedisDatabase redis = new RedisDatabase();
        ESDatabase es = new ESDatabase();
        oracle.setEs(es);
        oracle.setRedis(redis);
        es.setOracleDatabase(oracle);
        oracle.save("hello,world!");
        System.out.println("=========================");
        es.save(" es 存储数据 yes.");
    }
}
