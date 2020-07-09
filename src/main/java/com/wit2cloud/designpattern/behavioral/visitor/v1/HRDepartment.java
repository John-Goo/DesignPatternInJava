package com.wit2cloud.designpattern.behavioral.visitor.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: HRDepartment
 * @Desc: TODO
 * @history v1.0
 */
//ConcreteVisitor
public class HRDepartment  {

    public void settlement(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.print(">>正式全职员工：" + employee.getName() + "，实际工作时间为：" + workTime + "小时 ");
        if(workTime > 40) {
            System.out.println(",加班时间为：" + (workTime - 40) + "小时.");
        }
        else if(workTime < 40) {
            System.out.println(",请假时间为：" + (40 - workTime) + "小时，");
        }
    }

    public void settlement(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("**临时工:"+employee.getName() + ",实际工作时间为：" + workTime + "小时.");
    }
}
