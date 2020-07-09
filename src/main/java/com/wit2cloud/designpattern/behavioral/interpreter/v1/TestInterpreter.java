package com.wit2cloud.designpattern.behavioral.interpreter.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import java.util.Stack;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestInterpreter
 * @Desc: TODO
 * @history v1.0
 */
public class TestInterpreter {
    public static void main(String[] args) {
        String expStr = "3 8 - 6 2 + *";
        Stack<NumberExpression> stack = new Stack<>();
        String[] tokenArray = expStr.split(" ");
        for(String s : tokenArray){
            // op
            if(ExpressionUtil.isOperator(s)){
              NumberExpression left = stack.pop();
              NumberExpression right = stack.pop();
              Expression expression = ExpressionUtil.getOperator(s,left,right);
              int result = expression.interpret();
              stack.push(new NumberExpression(result));
              // non op
            }else{
                stack.push(new NumberExpression(Integer.valueOf(s)));
            }
        }
        int finalResult = stack.pop().interpret();
        System.out.println("最终结果："+finalResult);


    }
}
