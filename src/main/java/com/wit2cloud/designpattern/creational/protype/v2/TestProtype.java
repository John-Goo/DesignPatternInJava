package com.wit2cloud.designpattern.creational.protype.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import java.util.Arrays;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class TestProtype {

    public static User accessWebsite(Integer level) throws CloneNotSupportedException {
        AccessControl accessControl = null;
        String nickName = null;
        // 经理
        if(level == 1) {
            nickName = "经理";
            AccessControl coneObj = AccessControlProvider.get("Manager");
            // 直接克隆对象
            accessControl = coneObj.clone();
            accessControl.setRoleName(nickName);
        }
        // 职员
            if (level == 2){
            nickName = "职员";
                AccessControl coneObj = AccessControlProvider.get("Manager");

                // 直接克隆对象
                accessControl = coneObj.clone();
                accessControl.setRoleName(nickName);
        }

        if (level == 3){
            nickName = "财务";
            AccessControl coneObj = AccessControlProvider.get("Manager");
            System.out.println("克隆前地址："+coneObj);
            // 直接克隆对象
            accessControl = coneObj.clone();
            System.out.println("克隆后地址："+accessControl);
            accessControl.setRoleName(nickName);
        }
        User user = new User("1001","john", nickName, String.valueOf(level));
        // 赋值经理权限
        user.setAccessControl(accessControl);
        user.getAccessControl().setUsrId("1001");
        return user;
    }
    public static void main(String[] args) {
        User user = null;
        try {
            user = accessWebsite(3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(user);

    }
}
