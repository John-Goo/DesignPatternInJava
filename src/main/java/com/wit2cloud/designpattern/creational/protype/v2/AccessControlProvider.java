package com.wit2cloud.designpattern.creational.protype.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
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
    public static AccessControl get(String role){
        return acMap.get(role);
    }


    private static Map<String ,AccessControl> acMap = new HashMap<>();

    static {
        acMap.put("Manager",new AccessControl("经理", "1",
                Arrays.asList("/manage/security", "/manage/worker", "/manage/product")));
        acMap.put("Clerk",new AccessControl("职员", "1",
                Arrays.asList("/user/detail", "/user/tasks")));
        acMap.put("Fund", new AccessControl("账务", "1",
                Arrays.asList("/fund/income", "/fund/outcome")));
    }




}
