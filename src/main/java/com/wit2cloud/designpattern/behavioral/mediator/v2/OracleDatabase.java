package com.wit2cloud.designpattern.behavioral.mediator.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import com.wit2cloud.designpattern.behavioral.mediator.v1.AbstractDatabase;

import java.util.Timer;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: OracleDatabase
 * @Desc: TODO
 * @history v1.0
 */
public class OracleDatabase extends DBColleague{

    public OracleDatabase(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void save(String data) {
        // ORACLE数据库保存
        store(data);
        mediator.sync(Mediator._ORACLE,data);
    }

    @Override
    public void receive(String data) {
        System.out.println("[oracle数据库] 接收数据<--es："+data);
    }

    public void store(String data) {
        System.out.println("[oracle数据库] 执行存储："+data);

    }
}
