package com.wit2cloud.designpattern.creational.simplefactory.newv1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/


/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Apple
 * @Desc: 苹果树
 * @history v1.0
 */
public class AppleFruit implements Fruit {

    //编号
    private Long id;
    // 水果名称
    private  String name;

    public AppleFruit(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void plant() {
        System.out.println("[编号："+id+"名称："+name+"]==>种植.");
    }

    @Override
    public void water() {
        System.out.println("[编号："+id+"名称："+name+"]==>浇水.");
    }

    @Override
    public void pick() {
        System.out.println("[编号："+id+"名称："+name+"]==>采摘.");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AppleFruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
