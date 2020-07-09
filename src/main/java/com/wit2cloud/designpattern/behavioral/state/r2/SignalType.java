package com.wit2cloud.designpattern.behavioral.state.r2;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public enum SignalType {

    RED("红灯",new RedState()),
    GREEN("红灯",new GreenState()),
    YELLOW("红灯",new YellowState())
    ;


    private String name;
    public State color;

    SignalType(String name, State color) {
        this.name = name;
        this.color = color;
    }
}
