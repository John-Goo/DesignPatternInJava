package com.wit2cloud.designpattern.structural.decorator.v1;

public class SimplyVegPizza implements Pizza {

	@Override
	public String getDesc() {
		System.out.println("=============SimplyVegPizza=========");
		return "SimplyVegPizza (230)";
	}
	
	@Override
	public double getPrice() {
		return 230;
	}


}
