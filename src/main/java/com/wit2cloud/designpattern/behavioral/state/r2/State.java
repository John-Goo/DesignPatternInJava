package com.wit2cloud.designpattern.behavioral.state.r2;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface State {
    /**
     * 红绿类显示
     */
    public void show();

    /**
     * 红绿类切换
     */
    public void change(Context ctx);

    /**
     * 时间延迟
     */
    public void delay();

}
