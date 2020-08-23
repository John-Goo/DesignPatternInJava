package com.wit2cloud.designpattern.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import java.util.Date;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Calculate2PointDistance
 * @Desc: TODO
 * @history v1.0
 */
public class Calculate2PointDistance {

   /**
     * @desc:  计算两点之间距离
     * @author: John Goo
     * @date: 2020/8/22 22:33
     *
     */
    public static double distance(Point p1,Point p2){
        double x1 = p1.getX()-p2.getX();
        double y1 = p1.getX()-p2.getY();
        return Math.sqrt(x1*x1+y1*y1);
    }

    public static void main(String[] args) {
        Point p1 = new Point(434.8999,89.899);
        Point p2 = new Point(1222.9999,6666.79879);
        long start = new Date().getTime();
        for (int i = 0; i <100000000 ; i++) {
            double dist = distance(p1,p2);
            System.out.println(dist);
        }
        long end = new Date().getTime();
        System.out.println(end-start);

    }
}
