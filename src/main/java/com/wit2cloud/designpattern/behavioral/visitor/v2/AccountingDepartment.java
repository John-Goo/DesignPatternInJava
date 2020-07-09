package com.wit2cloud.designpattern.behavioral.visitor.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AccountingDepartment
 * @Desc: TODO
 * @history v1.0
 */
//ConcreteVisitor
public class AccountingDepartment implements Department{
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getMonthWage();
        if(workTime > 40) {
            weekWage = weekWage + (workTime - 40) * 30;
        }
        else if(workTime < 40) {
            weekWage = weekWage - (40 - workTime) * 100;
            if(weekWage < 0) {
                weekWage = 0;
            }
        }
        System.out.println(">>正式员工:" + employee.getName() + ",实际工资为：" + weekWage + "元.");

    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("**临时工:" + employee.getName() + ",实际工资为：" + workTime * hourWage + "元.");
    }
}
