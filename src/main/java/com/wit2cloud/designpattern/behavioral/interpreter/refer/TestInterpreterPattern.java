package com.wit2cloud.designpattern.behavioral.interpreter.refer;

import java.util.Stack;

public class TestInterpreterPattern {

	public static void main(String[] args) {
		// (7-3)*(2+1)  ===> 7 3 - 2 1 + *
		String tokenString = "7 3 - 2 1 + *";
		Stack<Expression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		for (String s : tokenArray) {
			if (ExpressionUtils.isOperator(s)) {
				Expression right = stack.pop();
				Expression left = stack.pop();
				Expression operator = ExpressionUtils.getOperator(s, left,right);
				int result = operator.interpret();
				stack.push(new Number(result));
			} else {
				Expression i = new Number(Integer.parseInt(s));
				stack.push(i);
			}
		}
		System.out.println("( "+tokenString+" ): "+stack.pop().interpret());

	}


}
