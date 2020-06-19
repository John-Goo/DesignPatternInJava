package com.wit2cloud.designpattern.structural.decorator.refer;

import java.text.DecimalFormat;

public class TestDecoratorPattern {
	
	public static void main(String[] args) {
		
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();
		
		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
		
		pizza = new SimplyNonVegPizza();
		
		pizza = new Meat(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Ham(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));
		System.out.println("----------------------");
		pizza = new FamilyBucketPizza();

		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);
		pizza = new Cheese(pizza);
		pizza = new Ham(pizza);
		pizza = new Pork(pizza);
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+dformat.format(pizza.getPrice()));

	}

}
