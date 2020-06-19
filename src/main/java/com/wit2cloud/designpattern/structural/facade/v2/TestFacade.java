package com.wit2cloud.designpattern.structural.facade.v2;
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
        ScheduleServer scheduleServer =  new ScheduleServer();
        ScheduleServerFacade serverFacade = new ScheduleServerFacade(scheduleServer);
        // 外界访问入口
        serverFacade.startServer();
        serverFacade.stopServer();
    }
}
