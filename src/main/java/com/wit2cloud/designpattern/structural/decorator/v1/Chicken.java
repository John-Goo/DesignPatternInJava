package com.wit2cloud.designpattern.structural.decorator.v1;

public class Chicken extends PizzaDecorator {


	protected Chicken(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Chicken (12.75)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+12.75;
	}

}