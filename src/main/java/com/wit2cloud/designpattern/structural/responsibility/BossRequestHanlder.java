package com.wit2cloud.designpattern.structural.responsibility;



public class BossRequestHanlder implements RequestHandler {
	
	private RequestHandler requHandler;

	public BossRequestHanlder() {
		this.requHandler = new HRRequestHandler();
	}

	public RequestHandler getRequHandler() {
		return requHandler;
	}

	public void setRequHandler(RequestHandler requHandler) {
		this.requHandler = requHandler;
	}

	@Override
	public void process(Request request) {
		int days = request.getDays();
		request.setAuditLevel(4);
		if(days>=30 && days< 360){
			request.setStatus(1);
			System.out.println("-->角色BOSS， 处于审批范围[30,360)，审批通过，转给hr.");
			this.setRequHandler(new HRRequestHandler());
		}else{
			request.setStatus(2);
			System.out.println("-->角色BOSS， 超出审批范围[30,360)，审批不通过，转给hr.");
		}
		requHandler.process(request);

	}

}
