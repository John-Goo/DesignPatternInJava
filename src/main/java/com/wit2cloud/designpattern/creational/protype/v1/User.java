package com.wit2cloud.designpattern.creational.protype.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: User
 * @Desc: TODO
 * @history v1.0
 */
public class User {
    // 标识
    private String id;
    //用户名称
    private String userName;
    // 昵称
    private String nickName;
    // 级别
    private String level;
    // 访问角色权限控制
    private AccessControl accessControl;

    public User(String id,String userName, String nickName, String level) {
        this.userName = userName;
        this.nickName = nickName;
        this.level = level;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", level='" + level + '\'' +
                ", accessControl=" + accessControl +
                '}';
    }
}
