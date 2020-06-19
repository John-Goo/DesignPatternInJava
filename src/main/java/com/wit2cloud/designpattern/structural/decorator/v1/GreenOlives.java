package com.wit2cloud.designpattern.structural.decorator.v1;

public class GreenOlives extends PizzaDecorator {


	protected GreenOlives(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		System.out.println("====GreenOlives ======");
		return pizza.getDesc()+", Green Olives (5.47)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+5.47;
	}

}