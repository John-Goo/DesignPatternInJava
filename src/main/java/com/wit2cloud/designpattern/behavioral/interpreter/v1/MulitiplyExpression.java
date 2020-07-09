package com.wit2cloud.designpattern.behavioral.interpreter.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AddExpression
 * @Desc: TODO
 * @history v1.0
 */
public class MulitiplyExpression implements Expression {

    private Expression left;
    private Expression right;



    public MulitiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return right.interpret()*left.interpret();
    }
}
