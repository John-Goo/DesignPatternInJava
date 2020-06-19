package com.wit2cloud.designpattern.structural.facade.v2;
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
public class ScheduleServerFacade {

    private ScheduleServer scheduleServer;

    public ScheduleServerFacade(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    /**
     * 开启服务
     */
    public void startServer(){
        // 打印日志
        // 鉴权
        // 过滤
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
    }

    /**
     * 关闭服务
     */
    public void stopServer(){
        // 关闭服务过程，stopServer
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
    
}
