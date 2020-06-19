package com.wit2cloud.designpattern.structural.decorator.refer;

public abstract class PizzaDecorator implements Pizza {
	
	@Override
	public String getDesc() {
		return "Toppings";
	}

}
