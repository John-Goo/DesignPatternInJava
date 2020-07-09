package com.wit2cloud.designpattern.behavioral.visitor.refer;

public interface Visitor {
	public void visit(HtmlElement element);
	public void visit(HtmlParentElement parentElement);
}
