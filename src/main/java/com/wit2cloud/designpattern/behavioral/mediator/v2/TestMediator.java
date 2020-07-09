package com.wit2cloud.designpattern.behavioral.mediator.v2;
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
public class TestMediator {
    public static void main(String[] args) {
        DBSynMediator mediator = new DBSynMediator();
        OracleDatabase oracle = new OracleDatabase(mediator);
        RedisDatabase redis = new RedisDatabase(mediator);
        ESDatabase es = new ESDatabase(mediator);

        mediator.setEs(es);
        mediator.setRedis(redis);
        mediator.setOracle(oracle);
        oracle.save("hello,world!");
        System.out.println("=========================");
        es.save(" es 存储数据 yes.");
    }
}
