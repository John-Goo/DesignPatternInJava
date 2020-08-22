package com.wit2cloud.designpattern.structural.responsibility.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import com.wit2cloud.designpattern.structural.responsibility.Request;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AuditUtil
 * @Desc: TODO
 * @history v1.0
 */
public class AuditUtil {

    public static final int _NO_AUDIT = 1;
    public static final int _AUDIT_PASS = 1;
    public static final int _AUDIT_NO_PASS = 2;

    public static final int _PM_LEVEL = 1;
    public static final int _MANAGER_LEVEL =2;
    public static final int _BOSS_LEVEL = 3;

    
    
    public static void auditProcess(Request request){
        int days = request.getDays();
        if(days<7){
            pmAudit(request);
        }else if(days >=7 && days <30){
            managerAudit(request);
        }else if(days >=30 && days <350){
            bossAudit(request);
        }
        hrProcess(request);
    }

    private static void hrProcess(Request request) {
        System.out.println("-->角色HR， 收到审批请假条："+request.getName());
    }

    private static void pmAudit(Request request) {
        request.setAuditLevel(_PM_LEVEL);
        request.setStatus(_AUDIT_PASS);
        System.out.println("-->角色PM， 处于审批范围[0,7)，审批通过，转给hr.");
    }

    private static void managerAudit(Request request) {
        request.setAuditLevel(_MANAGER_LEVEL);
        request.setStatus(_AUDIT_PASS);
        System.out.println("-->角色Manager， 处于审批范围[15,30)，审批通过，转给hr.");
    }

    private static void bossAudit(Request request) {
        request.setAuditLevel(_BOSS_LEVEL);
        request.setStatus(_AUDIT_PASS);
        System.out.println("-->角色BOSS， 处于审批范围[30,360)，审批通过，转给hr.");
    }
}
