package com.wit2cloud.designpattern.behavioral.visitor.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestVisitor
 * @Desc: TODO
 * @history v1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new FulltimeEmployee("张三",5000, 50));
        empList.add(new ParttimeEmployee("李四",100, 10));
        empList.add(new FulltimeEmployee("王二",10000, 20));
        /* 定义访问角色*/
        HRDepartment department = new HRDepartment();
        for(Employee e:empList){
            if(e instanceof FulltimeEmployee){
                department.settlement((FulltimeEmployee)e);
            }else if (e instanceof ParttimeEmployee){
                department.settlement((ParttimeEmployee)e);
            }
        }

        System.out.println("------------------");
        AccountingDepartment department2 = new AccountingDepartment();
        for(Employee e:empList){
            if(e instanceof FulltimeEmployee){
                department2.calculateWorktime((FulltimeEmployee)e);
            }else if (e instanceof ParttimeEmployee){
                department2.calculateWorktime((ParttimeEmployee)e);
            }
        }
        System.out.println("---------------------------");


}
}
