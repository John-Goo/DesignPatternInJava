package com.wit2cloud.designpattern.structural.decorator.v1;

public class Broccoli extends PizzaDecorator {


	protected Broccoli(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Broccoli (9.25)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+9.25;
	}

}