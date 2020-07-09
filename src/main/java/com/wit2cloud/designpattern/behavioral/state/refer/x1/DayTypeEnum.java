package com.wit2cloud.designpattern.behavioral.state.refer.x1;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public enum DayTypeEnum {
    DAY(1,new DayState()),
    NIGHT(2,new NightState());//这个后面必须有分号

    private int code;
    public final State value;

    private DayTypeEnum(int code, State value) {
        this.code = code;
        this.value = value;
    }




    public static void main(String[] args) {
        State s = DayTypeEnum.NIGHT.value;
        System.out.println(s);
        s = DayTypeEnum.NIGHT.value;
        System.out.println(s);
    }
}
