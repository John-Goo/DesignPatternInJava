package com.wit2cloud.designpattern.structural.decorator.v1;

public class Ham extends PizzaDecorator {


	protected Ham(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Ham (18.12)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+18.12;
	}

}