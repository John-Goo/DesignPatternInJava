package com.wit2cloud.designpattern.structural.facade.v3;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestFacade
 * @Desc: TODO
 * @history v1.0
 */
public class TestFacade {
    public static void main(String[] args) {
        MyServer server =  new ScheduleServer("ScheduleServer");
        MyServerFacade serverFacade = new MyServerFacade(server);
        // 外界访问入口
        System.out.println(" ============ 启动 ScheduleServer ==========");
        serverFacade.startServer();
        serverFacade.stopServer();
        System.out.println(" ============ 启动 JettyServer ==========");
        server = new  JettyServer("JettyServer");
        serverFacade = new MyServerFacade(server);
        serverFacade.startServer();
        serverFacade.stopServer();
        System.out.println(" ============ 启动 NettyServer ==========");
        server = new  NettyServer("NettyServer");
        serverFacade = new MyServerFacade(server);
        serverFacade.startServer();
        serverFacade.stopServer();

        System.out.println(" ============ 启动 TomcatServer ==========");
        server = new  TomcatServer("TomcatServer");
        serverFacade = new MyServerFacade(server);
        serverFacade.startServer();
        serverFacade.stopServer();
    }
}
