package com.wit2cloud.designpattern.behavioral.iterator;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: SharpeAggregateImpl
 * @Desc: TODO
 * @history v1.0
 */
public class ShapeAggregateImpl implements ShapeAggregate {

    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void add(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void remove(int pos) {
        shapes.remove(pos-1);
    }

    @Override
    public ShapeIterator iterator() {
        return new ShapeIterator(shapes);
    }
}
