package com.wit2cloud.designpattern.behavioral.command.ref;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCommandPattern1 {
	public static void main(String[] args)
    {
        init();
    }
 
    private static void init()
    {

        Email email = null;
        EmailJob  emailJob = new EmailJob();
        
        Sms sms = null;
        SmsJob smsJob = new SmsJob();
        
        FileIO fileIO = null;
        FileIOJob fileIOJob = new FileIOJob();

        ExecutorService execute = Executors.newFixedThreadPool(10);
        
        Logging logging = null;;
        LoggingJob logJob = new LoggingJob();
        
        for (int i = 0; i < 5; i++) {
        	email = new Email();
        	emailJob.setEmail(email);
        	
        	sms = new Sms();
        	smsJob.setSms(sms);
        	
        	fileIO = new FileIO();
        	fileIOJob.setFileIO(fileIO);
        	
        	logging = new Logging();
        	logJob.setLogging(logging);
            execute.submit(emailJob);
            execute.submit(smsJob);
            execute.submit(fileIOJob);
            execute.submit(logJob);
        }
        execute.shutdown();
    }

}
