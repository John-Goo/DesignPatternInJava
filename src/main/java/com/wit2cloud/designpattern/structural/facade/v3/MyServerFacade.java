package com.wit2cloud.designpattern.structural.facade.v3;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: ScheduleServerFacade
 * @Desc: 门面店模式
 * @history v1.0
 */
public class MyServerFacade {

    private MyServer myServer;

    public MyServerFacade(MyServer myServer) {
        this.myServer = myServer;
    }

    /**
     * 开启服务
     */
    public void startServer(){
        // 打印日志
        // 鉴权
        // 过滤
        myServer.startBooting();
        myServer.readSystemConfigFile();
        myServer.init();
        myServer.initializeContext();
        myServer.initializeListeners();
        myServer.createSystemObjects();
    }

    /**
     * 关闭服务
     */
    public void stopServer(){
        // 关闭服务过程，stopServer
        myServer.releaseProcesses();
        myServer.destory();
        myServer.destroySystemObjects();
        myServer.destoryListeners();
        myServer.destoryContext();
        myServer.shutdown();
    }
    
}
