package com.wit2cloud.designpattern.structural.proxy.refer.protectionproxy;

public interface Staff {

	public boolean isOwner();
	public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
