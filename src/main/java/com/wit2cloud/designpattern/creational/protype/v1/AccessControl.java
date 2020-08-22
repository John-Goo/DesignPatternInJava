package com.wit2cloud.designpattern.creational.protype.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AccessControl
 * @Desc: TODO
 * @history v1.0
 */
public class AccessControl {
    private String usrId;
    private String roleName;
    private String controlLevel;
    private List<String> acl = new ArrayList<String>();

    public AccessControl(String roleName, String controlLevel, List<String> acl) {
        this.roleName = roleName;
        this.controlLevel = controlLevel;
        this.acl = acl;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getControlLevel() {
        return controlLevel;
    }

    public void setControlLevel(String controlLevel) {
        this.controlLevel = controlLevel;
    }

    public List<String> getAcl() {
        return acl;
    }

    public void setAcl(List<String> acl) {
        this.acl = acl;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    @Override
    public String toString() {
        return "AccessControl{" +
                "roleName='" + roleName + '\'' +
                ", controlLevel='" + controlLevel + '\'' +
                ", acl=" + acl +
                '}';
    }
}
