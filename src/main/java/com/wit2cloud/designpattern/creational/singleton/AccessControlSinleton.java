package com.wit2cloud.designpattern.creational.singleton;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AccessControlProvider
 * @Desc: 演示单例设计模式使用
 * @history v1.0
 */
public class AccessControlSinleton {

    // ACL访问控制列表
    private  static Map<String, AccessControl> accessControlMap = new HashMap<String, AccessControl>();

    // 闭合，不允许外界实例化
    private AccessControlSinleton(){
    }
    private  static AccessControlSinleton accessControlSinleton;

    /**
     *
     * 获取访问实例的入口
     *
     * @return
     */
    public static AccessControlSinleton getInstance(){
        if(accessControlSinleton == null){
            // 加锁，保证实例不会并发创建
            synchronized (AccessControlSinleton.class){
                if(accessControlSinleton == null){
                    accessControlSinleton = new AccessControlSinleton();
                }
            }
        }
        return accessControlSinleton;
    }



    static {
        // 访问权限：经理角色
        accessControlMap.put("MANAGER",
                new AccessControl("经理", "MANAGER",
                        Arrays.asList("/manage/security", "/manage/worker", "/manage/product")));
        // 访问权限：职员角色CLERK
        accessControlMap.put("CLERK",
                new AccessControl("职员", "CLERK",
                        Arrays.asList("/fund/income", "/fund/outcome")));

        // 访问权限：账务角色FUND
        accessControlMap.put("FUND",
                new AccessControl("账务", "FUND",
                        Arrays.asList("/fund/income", "/fund/outcome")));
    }

    public  AccessControl fetchAccessControl(String controlLevel){
        return accessControlMap.get(controlLevel);
    }

    /**
     * 增加访问控制数据
     * @param controlLevel
     * @param accessControl
     */
    public void putAccessControl(String controlLevel,AccessControl accessControl){
        accessControlMap.put(controlLevel,accessControl);
    }
}
