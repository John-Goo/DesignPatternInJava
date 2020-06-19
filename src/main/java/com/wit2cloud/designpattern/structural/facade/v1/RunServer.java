package com.wit2cloud.designpattern.structural.facade.v1;

public class RunServer {


	// client 端
	public static void main(String[] args) {

		ScheduleServer scheduleServer = new ScheduleServer();

		// 开启服务过程,startServer
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
		// //////////////////

		System.out.println("Start working......");
		System.out.println("After work done.........");
		// 关闭服务过程，stopServer
		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
		////////////////////

		ScheduleServer scheduleServer1 = new ScheduleServer();
		/*
		 * 对外界开放的接口过多，违反了迪米特原则
		 * */
		scheduleServer1.startBooting();
		scheduleServer1.readSystemConfigFile();
		scheduleServer1.init();
		scheduleServer1.initializeContext();
		scheduleServer1.initializeListeners();
		scheduleServer1.createSystemObjects();

		System.out.println("Start working......");
		System.out.println("After work done.........");

		scheduleServer1.releaseProcesses();
		scheduleServer1.destory();
		scheduleServer1.destroySystemObjects();
		scheduleServer1.destoryListeners();
		scheduleServer1.destoryContext();
		scheduleServer1.shutdown();
	}

}
