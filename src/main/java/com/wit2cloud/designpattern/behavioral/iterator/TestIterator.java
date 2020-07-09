package com.wit2cloud.designpattern.behavioral.iterator;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestIterator
 * @Desc: TODO
 * @history v1.0
 */
public class TestIterator {
    public static void main(String[] args) {
        ShapeAggregate sa = new ShapeAggregateImpl();
        sa.add(new Shape(1,"长方形"));
        sa.add(new Shape(2,"正方形"));
        sa.add(new Shape(3,"三角形"));
        sa.add(new Shape(4,"圆形"));
        sa.add(new Shape(5,"六边形"));
        sa.add(new Circle(6,"三角形"));
        Iterator<Shape> it = sa.iterator();
        while (it.hasNext()){
            Shape shape = it.next();
            System.out.println(shape);
        }
        sa.remove(2);
        Iterator<Shape> it1 = sa.iterator();
        System.out.println("============");
        while (it1.hasNext()){
            Shape shape = it1.next();
            System.out.println(shape);
        }
    }
}
