package com.wit2cloud.designpattern.structural.responsibility;

public class HRRequestHandler implements RequestHandler {

	@Override
	public void process(Request request) {
		System.out.println("-->角色HR， 收到审批请假条："+request.getName());
	}

}
