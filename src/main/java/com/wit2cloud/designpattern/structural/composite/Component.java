package com.wit2cloud.designpattern.structural.composite;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public abstract class Component {

    protected String nodeName;

    public abstract void add(Component child);

    public abstract void remove(Component child);

    public abstract  Component getChild(int index);

    public Component(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public String toString() {
        return "Component{" +
                "nodeName='" + nodeName + '\'' +
                '}';
    }
}
