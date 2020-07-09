package com.wit2cloud.designpattern.behavioral.iterator;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import java.util.List;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: SharapeIterator
 * @Desc: TODO
 * @history v1.0
 */
public class ShapeIterator implements Iterator<Shape> {

    private List<Shape>  sharpes;
    private int pos;

    public ShapeIterator(List<Shape> sharpes) {
        this.sharpes = sharpes;
    }

    @Override
    public Shape next() {
        return sharpes.get(pos++);
    }

    @Override
    public boolean hasNext() {
        return pos<sharpes.size();
    }
}
