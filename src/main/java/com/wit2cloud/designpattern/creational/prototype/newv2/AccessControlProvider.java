package com.wit2cloud.designpattern.creational.prototype.newv2;
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
 * @Desc: TODO
 * @history v1.0
 */
public class AccessControlProvider {

    private  static Map<String,AccessControl> accessControlMap = new HashMap<String,AccessControl>();

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

    public static AccessControl getAccessControl(String controlLevel){
        return accessControlMap.get(controlLevel);
    }
}
