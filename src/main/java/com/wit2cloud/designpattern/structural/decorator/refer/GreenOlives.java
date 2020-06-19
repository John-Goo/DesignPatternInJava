package com.wit2cloud.designpattern.structural.decorator.refer;

public class GreenOlives extends PizzaDecorator{

	private final Pizza pizza;
	
	public GreenOlives(Pizza pizza){
		this.pizza = pizza;
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