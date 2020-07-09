package com.wit2cloud.designpattern.behavioral.state.refer.x1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: DaySession
 * @Desc: TODO
 * @history v1.0
 */
public class DaySession {

    // 当前时间
    private static  int nowTime = 0;
    // 本地缓存
    private static Context context = null;
    private static Object lock = new Object();

    public static Object getLock(){
        return lock;
    }


    public synchronized static void setNowtime(int nowTime1){
        nowTime = nowTime1;
        System.out.println(" ** lock before**");
        synchronized (lock) {
            lock.notifyAll();
            System.out.println(" ** lock afer**");
        }
    }
    public static int fetchNowTime(){
        return nowTime;
    }

    public static void setCtx(Context ctx){
        context = ctx;
    }
    public static Context getCtx(){
       return context;
    }


}
