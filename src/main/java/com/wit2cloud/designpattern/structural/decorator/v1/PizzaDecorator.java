package com.wit2cloud.designpattern.structural.decorator.v1;

public abstract class PizzaDecorator implements Pizza {
	protected final Pizza pizza;

	protected PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return "Toppings";
	}

}
