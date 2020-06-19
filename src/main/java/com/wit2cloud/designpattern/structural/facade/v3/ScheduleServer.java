package com.wit2cloud.designpattern.structural.facade.v3;


public class ScheduleServer extends  MyServer{


	public ScheduleServer(String serverName) {
		super(serverName);
	}

	public void startBooting(){
		System.out.println("["+serverName+"] ["+serverName+"] Starts booting...");
	}
	
	public void readSystemConfigFile(){
		System.out.println("["+serverName+"] Reading system config files...");
	}
	
	public void init(){
		System.out.println("["+serverName+"] Initializing...");
	}
	
	public void initializeContext(){
		System.out.println("["+serverName+"] Initializing context...");
	}
	
	public void initializeListeners(){
		System.out.println("["+serverName+"] Initializing listeners...");
	}
	
	public void createSystemObjects(){
		System.out.println("["+serverName+"] Creating system objects...");
	}
	
	public void releaseProcesses(){
		System.out.println("["+serverName+"] Releasing processes...");
	}
	
	public void destory(){
		System.out.println("["+serverName+"] Destorying...");
	}
	
	public void destroySystemObjects(){
		System.out.println("["+serverName+"] Destroying system objects...");
	}
	
	public void destoryListeners(){
		System.out.println("["+serverName+"] Destroying listeners...");
	}
	
	public void destoryContext(){
		System.out.println("["+serverName+"] Destroying context...");
	}

	public void shutdown(){
		System.out.println("["+serverName+"] Shutting down...");
	}
}
