package com.wit2cloud.designpattern.structural.responsibility;



public class PMRequestHandler implements RequestHandler {

	private  RequestHandler requHandler;

	public PMRequestHandler(){
		requHandler = new ManagerRequestHandler();
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
		if(days< 7){
			request.setAuditLevel(2);
			request.setStatus(1);
			System.out.println("-->角色PM， 处于审批范围[0,7)，审批通过，转给hr.");
			this.setRequHandler(new HRRequestHandler());
		}else{
			System.out.println("-->角色PM， 超出审批范围[0,7)，转给BOSS 审批.");
		}
		requHandler.process(request);

	}

}
