package com.wit2cloud.designpattern.behavioral.mediator.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: DBSynMediator
 * @Desc: TODO
 * @history v1.0
 */
public class DBSynMediator implements Mediator {

    private  OracleDatabase oracle;
    private  ESDatabase es;
    private RedisDatabase redis;

    public void setOracle(OracleDatabase oracle) {
        this.oracle = oracle;
    }

    public void setEs(ESDatabase es) {
        this.es = es;
    }

    public void setRedis(RedisDatabase redis) {
        this.redis = redis;
    }

    @Override
    public void sync(String databaseType,String data) {
        if(Mediator._ORACLE.equals("oracle")){
            redis.receive(data);
            System.out.println("[oracle数据库] 数据同步-->redis："+data);
            System.out.println("[oracle数据库] 数据同步-->es："+data);
            es.receive(data);
        }else if(Mediator._ES.equals("es")){
            System.out.println("[es数据库] 数据同步-->oracle："+data);
            oracle.receive(data);
        }else if(Mediator._REDIS.equals("redis")){
            // do nothing
        }else {
            System.out.println(">>> 不支持该数据库类型："+databaseType);
        }


    }

}
