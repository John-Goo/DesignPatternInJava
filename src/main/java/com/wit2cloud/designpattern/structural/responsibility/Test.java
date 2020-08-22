package com.wit2cloud.designpattern.structural.responsibility;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.wit2cloud.designpattern.behavioral.visitor.v2.HRDepartment;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {
    public static void main(String[] args) {
        Request request = new Request("1001","John Goo",35);
        PMRequestHandler pm = new PMRequestHandler();
        pm.process(request);

    }



}
