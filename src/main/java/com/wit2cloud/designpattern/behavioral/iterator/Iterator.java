package com.wit2cloud.designpattern.behavioral.iterator;

/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/
public interface Iterator<T> {
    public T next();
    public boolean hasNext();
}
