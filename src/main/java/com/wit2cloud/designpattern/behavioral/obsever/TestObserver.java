package com.wit2cloud.designpattern.behavioral.obsever;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestObserver
 * @Desc: TODO
 * @history v1.0
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new StarSubject();
        Observer observer1 = new FansObserver("OBS1",subject);
        observer1.subscribe();
        Observer observer2 = new FansObserver("OBS2",subject);
        observer2.subscribe();

        StarSubject star = (StarSubject) subject;
        star.push("今天有刘德华块演唱会...");
        star.push("明天有刘德华电影!");
    }
}
