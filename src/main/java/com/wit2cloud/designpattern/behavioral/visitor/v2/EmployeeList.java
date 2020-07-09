package com.wit2cloud.designpattern.behavioral.visitor.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import java.util.ArrayList;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: EmployeeList
 * @Desc: TODO
 * @history v1.0
 */
public class EmployeeList {
    //存储员工对象集合
    private ArrayList<Employee> list = new ArrayList<Employee>();

    /**
     * 添加员工
     * @param employee
     */
    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    /**
     *  遍历访问集合的每一个员工
     * @param handler
     */
    public void accept(Department handler) {
        for(Object obj : list) {
            ((Employee)obj).accept(handler);
        }
    }
}
