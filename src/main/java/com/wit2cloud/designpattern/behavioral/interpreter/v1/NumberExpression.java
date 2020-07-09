package com.wit2cloud.designpattern.behavioral.interpreter.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: NumberExpression
 * @Desc: TODO
 * @history v1.0
 */
public class NumberExpression implements Expression {

    private int i;

    public NumberExpression(int i) {
        this.i = i;
    }

    @Override
    public int interpret() {
        return i;
    }
}
