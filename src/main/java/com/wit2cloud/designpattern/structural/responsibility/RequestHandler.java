package com.wit2cloud.designpattern.structural.responsibility;

/**
 * chain of responsibility
 * @author pactera
 *
 */
public interface RequestHandler {

	public void process(Request request);

}
