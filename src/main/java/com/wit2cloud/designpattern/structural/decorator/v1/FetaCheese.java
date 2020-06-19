package com.wit2cloud.designpattern.structural.decorator.v1;

public class FetaCheese extends PizzaDecorator {


	protected FetaCheese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Feta Cheese (25.88)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+25.88;
	}

}