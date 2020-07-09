package com.wit2cloud.designpattern.behavioral.interpreter.refer;

public class Number implements Expression{

	private final int n;
	
	public Number(int n){
		this.n = n;
	}
	@Override
	public int interpret() {
		return n;
	}

	public static void main(String[] args) {
		Number n = new Number(10000);
		int i = n.interpret();
		System.out.println(i);
	}

}
