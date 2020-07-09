package com.wit2cloud.designpattern.behavioral.interpreter.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: ExpressionUtil
 * @Desc: TODO
 * @history v1.0
 */
public class ExpressionUtil {

    public static Expression getOperator(String s,Expression left,Expression right){
        switch (s){
            case "+" : return new AddExpression(left,right);
            case "-" : return new SubstractExpression(left,right);
            case "*" : return new MulitiplyExpression(left,right);
        }
        return null;
    }

    public static boolean isOperator(String op){
        if("+".equals(op)||"-".equals(op)||"*".equals(op)){
            return true;
        }
        return false;
    }
}
