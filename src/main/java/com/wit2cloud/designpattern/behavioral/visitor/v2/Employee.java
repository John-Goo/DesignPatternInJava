package com.wit2cloud.designpattern.behavioral.visitor.v2;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
// 高级抽象接口Element
public interface Employee {

    public void accept(Department department);

}
