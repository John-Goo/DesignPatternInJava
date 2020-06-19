package com.wit2cloud.designpattern.creational.prototype.old;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import java.io.Serializable;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Stamp
 * @Desc: TODO
 * @history v1.0
 */
public class Stamp implements Serializable {

    String mailCode;

    public String getMailCode() {
        return mailCode;
    }

    public void setMailCode(String mailCode) {
        this.mailCode = mailCode;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "mailCode='" + mailCode + '\'' +
                '}';
    }
}
