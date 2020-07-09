package com.wit2cloud.designpattern.behavioral.mediator.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: OracleDatabase
 * @Desc: TODO
 * @history v1.0
 */
public class OracleDatabase extends AbstractDatabase {

    private RedisDatabase redis;
    private ESDatabase es;

    public void setRedis(RedisDatabase redis) {
        this.redis = redis;
    }

    public void setEs(ESDatabase es) {
        this.es = es;
    }

    @Override
    public void save(String data) {
        // ORACLE数据库保存
        store(data);
        sync(data);
    }

    @Override
    public void sync(String data) {
        System.out.println("[oracle数据库] 数据同步-->redis："+data);
        redis.receive(data);
        System.out.println("[oracle数据库] 数据同步-->es："+data);
        es.receive(data);
    }

    @Override
    public void receive(String data) {
        System.out.println("[oracle数据库] 接收数据<--es："+data);
    }

    public void store(String data) {
        System.out.println("[oracle数据库] 执行存储："+data);
    }
}
