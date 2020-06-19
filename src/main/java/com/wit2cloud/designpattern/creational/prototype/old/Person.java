package com.wit2cloud.designpattern.creational.prototype.old;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import java.io.Serializable;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Person
 * @Desc: TODO
 * @history v1.0
 */
public class Person implements Serializable,Cloneable{

    // 名称
    private String name;
    // 地址
    private Address addr;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    protected Person deepClone() throws CloneNotSupportedException {
        return (Person) CloneUtil.deepClone(this);
    }

    public Person() {
        this.name = "init";
        this.addr = null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}
