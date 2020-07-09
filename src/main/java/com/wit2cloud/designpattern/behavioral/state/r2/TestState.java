package com.wit2cloud.designpattern.behavioral.state.r2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestState
 * @Desc: TODO
 * @history v1.0
 */
public class TestState {
    public static void main(String[] args) {
        GreenState green = new GreenState();
        Context context = new Context(green);
        context.doWork();
}

}
