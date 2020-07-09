package com.wit2cloud.designpattern.behavioral.visitor.v2;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface Department {
    public void visit(FulltimeEmployee employee);
    public void visit(ParttimeEmployee employee);
}
