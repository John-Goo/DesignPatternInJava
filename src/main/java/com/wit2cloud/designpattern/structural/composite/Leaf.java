package com.wit2cloud.designpattern.structural.composite;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Leaf
 * @Desc: TODO
 * @history v1.0
 */
public class Leaf extends Branch{

    public Leaf(String nodeName) {
        super(nodeName);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "nodeName='" + nodeName + '\'' +
                '}';
    }
}
