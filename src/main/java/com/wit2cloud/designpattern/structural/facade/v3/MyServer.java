package com.wit2cloud.designpattern.structural.facade.v3;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: MyServer
 * @Desc: 抽象接口类
 * @history v1.0
 */
public abstract class MyServer {

    protected String serverName;

    public MyServer(String serverName) {
        this.serverName = serverName;
    }

    public abstract void startBooting();

    public abstract void readSystemConfigFile();

    public abstract void init();

    public abstract void initializeContext();

    public abstract void initializeListeners();

    public abstract void createSystemObjects();

    public abstract void releaseProcesses();

    public abstract void destory();

    public abstract void destroySystemObjects();

    public abstract void destoryListeners();

    public abstract void destoryContext();

    public abstract void shutdown();

}
