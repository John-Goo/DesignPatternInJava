package com.wit2cloud.designpattern.creational.singleton;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {

    public static User accessWebsite(String id, String userName, String level) throws CloneNotSupportedException {
        // 获取原型对象
        AccessControl accessControl = AccessControlSinleton.getInstance().fetchAccessControl(level);
        // 克隆原型
        AccessControl cloneAccessControl =accessControl.clone();
        User user = new User(id,userName, accessControl.getRoleName(), String.valueOf(level));
        // 赋值经理权限
        user.setAccessControl(cloneAccessControl);
        // 关联权限角色
        user.getAccessControl().setUsrId(id);
        return user;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = accessWebsite("1001","John Goo","CLERK");
        User user2 = accessWebsite("1002","Cherry","MANAGER");
        System.out.println("clerk:"+user);
        System.out.println("manager:"+user2);
    }
}
