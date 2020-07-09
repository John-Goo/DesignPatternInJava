package com.wit2cloud.designpattern.behavioral.mediator.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/


/**
 * @author John Goo
 * @version 1.0
 * @ClassName: ESDatabase
 * @Desc: TODO
 * @history v1.0
 */
public class ESDatabase extends DBColleague {

    private OracleDatabase oracleDatabase;

    public ESDatabase(Mediator mediator) {
        super(mediator);
    }

    public void setOracleDatabase(OracleDatabase oracleDatabase) {
        this.oracleDatabase = oracleDatabase;
    }

    @Override
    public void save(String data) {
        store(data);
        mediator.sync(Mediator._ES,data);
    }

    private void store(String data) {
        System.out.println("[es数据库] 执行存储："+data);
    }

    @Override
    public void receive(String data) {
        System.out.println("[es数据库] 接收数据<--oracle："+data);
    }
}
