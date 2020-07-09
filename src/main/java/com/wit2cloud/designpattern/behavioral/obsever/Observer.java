package com.wit2cloud.designpattern.behavioral.obsever;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface Observer {
    public void update(String msg);
    public void subscribe();
    public void unSubscribe();
}
