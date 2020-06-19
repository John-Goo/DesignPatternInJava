package com.wit2cloud.designpattern.structural.chain;

public interface Handler {
	
	public void setHandler(Handler handler);
	public void process(File file);
	public String getHandlerName();
}
