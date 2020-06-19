package com.wit2cloud.designpattern.structural.decorator.refer;

public class RomaTomatoes extends PizzaDecorator{

	private final Pizza pizza;

	public RomaTomatoes(Pizza pizza){
		this.pizza = pizza;
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
