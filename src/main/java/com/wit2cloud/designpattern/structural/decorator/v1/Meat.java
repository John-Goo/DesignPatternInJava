package com.wit2cloud.designpattern.structural.decorator.v1;

public class Meat extends PizzaDecorator {


	protected Meat(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Meat (14.25)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+14.25;
	}

}