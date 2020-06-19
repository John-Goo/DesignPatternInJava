package com.wit2cloud.designpattern.structural.decorator.v1;

public class Cheese extends PizzaDecorator {

	protected Cheese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Cheese (20.72)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+20.72;
	}

}