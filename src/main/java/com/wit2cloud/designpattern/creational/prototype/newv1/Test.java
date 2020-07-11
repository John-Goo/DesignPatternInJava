package com.wit2cloud.designpattern.creational.prototype.newv1;
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
public class Test {

    public static User accessWebsite(Integer level){
        AccessControl accessControl = null;
        String nickName = null;
        // 经理
        if(level == 1) {
            nickName = "经理";
            accessControl = new AccessControl(nickName, "1",
                     Arrays.asList("/manage/security", "/manage/worker", "/manage/product"));
        }
        // 职员
        if (level == 2){
            nickName = "职员";
            accessControl = new AccessControl(nickName, "1",
            Arrays.asList("/user/detail", "/user/tasks"));
        }

        if (level == 3){
            nickName = "财务";
            accessControl = new AccessControl(nickName, "1",
                    Arrays.asList("/fund/income", "/fund/outcome"));
        }
        User user = new User("1001","john", nickName, String.valueOf(level));
        // 赋值经理权限
        user.setAccessControl(accessControl);
        user.getAccessControl().setUsrId("1001");
        return user;
    }
    public static void main(String[] args) {
        User user =  accessWebsite(2);
        System.out.println(user);

    }
}
