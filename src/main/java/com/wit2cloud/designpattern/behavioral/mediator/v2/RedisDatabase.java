package com.wit2cloud.designpattern.behavioral.mediator.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import com.wit2cloud.designpattern.behavioral.mediator.v1.AbstractDatabase;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: RedisDatabase
 * @Desc: TODO
 * @history v1.0
 */
public class RedisDatabase  extends DBColleague{
    public RedisDatabase(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void save(String data) {
    }


    @Override
    public void receive(String data) {
        System.out.println("[redis数据库] 接收数据<--oracle："+data);
    }
}
