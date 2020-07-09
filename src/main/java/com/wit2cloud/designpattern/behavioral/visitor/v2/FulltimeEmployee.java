package com.wit2cloud.designpattern.behavioral.visitor.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: FulltimeEmployee
 * @Desc: TODO
 * @history v1.0
 */
// ConcreteElement
public class FulltimeEmployee implements Employee{

    /*员工姓名*/
    private String name;
    /*员工月薪*/
    private double monthWage;
    /*工作时间*/
    private int workTime;

    public FulltimeEmployee(String name, double monthWage, int workTime) {
        this.name = name;
        this.monthWage = monthWage;
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthWage() {
        return monthWage;
    }

    public void setMonthWage(double monthWage) {
        this.monthWage = monthWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
