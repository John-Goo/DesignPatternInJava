package com.wit2cloud.designpattern.structural.decorator.refer;

public class SimplyNonVegPizza implements Pizza{
	
	@Override
	public String getDesc() {
		return "SimplyNonVegPizza (350)";
	}

	@Override
	public double getPrice() {
		return 350;
	}

}
