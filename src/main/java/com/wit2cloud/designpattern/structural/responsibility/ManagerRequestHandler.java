package com.wit2cloud.designpattern.structural.responsibility;



public class ManagerRequestHandler implements RequestHandler {

	private  RequestHandler requHandler;

	public ManagerRequestHandler(){
		requHandler = new BossRequestHanlder();
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
		if(days>=7 && days< 30){
			request.setAuditLevel(3);
			request.setStatus(1);
			System.out.println("-->角色Manager， 处于审批范围[15,30)，审批通过，转给hr.");
			this.setRequHandler(new HRRequestHandler());
		}else{
			System.out.println("-->角色Manager， 超出审批范围[15,30)，转给BOSS 审批.");
		}
		//传递操作
		requHandler.process(request);

	}

}
