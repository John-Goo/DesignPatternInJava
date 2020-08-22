package com.wit2cloud.designpattern.structural.responsibility;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Request
 * @Desc: TODO
 * @history v1.0
 */
public class Request {

    private String stuffId;
    private String name;
    //请假天数
    private int days;
    // 审核状态：1-leader,2-manager,3-boss
    private int auditLevel;
    // 0-未审校，1-审核通过，2-审核未通过
    private int status;

    public Request(String stuffId, String name, int days) {
        this.stuffId = stuffId;
        this.name = name;
        this.days = days;
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getAuditLevel() {
        return auditLevel;
    }

    public void setAuditLevel(int auditLevel) {
        this.auditLevel = auditLevel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
