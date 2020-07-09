package com.wit2cloud.designpattern.behavioral.visitor.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestVisitor
 * @Desc: TODO
 * @history v1.0
 */
public class TestVisitor {
    public static void main(String[] args) {
        EmployeeList empList = new EmployeeList();
        empList.addEmployee(new FulltimeEmployee("张三",5000, 50));
        empList.addEmployee(new ParttimeEmployee("李四",100, 10));
        empList.addEmployee(new FulltimeEmployee("王二",10000, 20));
        /* 定义访问角色*/
        Department department = new HRDepartment();
        empList.accept(department);
        System.out.println("------------------");
        department = new AccountingDepartment();
        empList.accept(department);
        System.out.println("---------------------------");
       new FulltimeEmployee("张三",5000, 50).accept(new HRDepartment());

}
}
