package com.wit2cloud.designpattern.structural.composite;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Branch
 * @Desc: TODO
 * @history v1.0
 */
public class Branch extends Tree{
    public Branch(String nodeName) {
        super(nodeName);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchList=" + branchList +
                ", nodeName='" + nodeName + '\'' +
                '}';
    }
}
