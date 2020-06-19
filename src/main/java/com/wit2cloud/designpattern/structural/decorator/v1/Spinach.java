package com.wit2cloud.designpattern.structural.decorator.v1;

public class Spinach extends PizzaDecorator {


	protected Spinach(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Spinach (7.92)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+7.92;
	}

}
