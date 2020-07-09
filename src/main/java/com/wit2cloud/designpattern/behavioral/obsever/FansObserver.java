package com.wit2cloud.designpattern.behavioral.obsever;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: FansObserver
 * @Desc: TODO
 * @history v1.0
 */
public class FansObserver  implements Observer{

    private String fsId;
    private Subject subject;

    public FansObserver(String fsId, Subject subject) {
        this.fsId = fsId;
        this.subject = subject;
    }

    @Override
    public void update(String msg) {
        System.out.println("** 接收到Subject消息["+fsId+"]："+msg);
    }

    @Override
    public void subscribe() {
        subject.addObserver(this);
    }

    @Override
    public void unSubscribe() {
        subject.removeObserver(this);
    }
}
