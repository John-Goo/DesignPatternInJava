package com.wit2cloud.designpattern.structural.decorator.v1;

public class RomaTomatoes extends PizzaDecorator {


	protected RomaTomatoes(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc() {
		System.out.println("====RomaTomatoes ======");
		return pizza.getDesc()+", Roma Tomatoes (5.20)";
	}


	@Override
	public double getPrice() {
		return pizza.getPrice()+5.20;
	}

}
