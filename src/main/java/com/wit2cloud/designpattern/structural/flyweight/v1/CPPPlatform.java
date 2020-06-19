package com.wit2cloud.designpattern.structural.flyweight.v1;

public class CPPPlatform implements Platform{
	
	public CPPPlatform(){
		System.out.println("CPPPlatform object created");
	}
	
	@Override
	public void execute(Code code) {
		System.out.println("Compiling and executing CPP code.");
	}

}
