package com.wit2cloud.designpattern.creational.prototype.old;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import java.util.Date;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {

    //total:1058
    public static void main(String[] args) {
        long startTime = new Date().getTime();
        for (int i = 0; i <1000000000 ; i++) {
            //6385
            Person p1 = new Person();
            p1.setName("John Goo");
            Address addr = new Address();
            addr.setCountry("中国");
            addr.setCity("深圳");
            addr.setStreet("street");
            p1.setAddr(addr);
            Stamp stamp = new Stamp();
            stamp.setMailCode("0000-000");
            p1.getAddr().setStamp(stamp);
        }
        long endTime = new Date().getTime();
        System.out.println("total:"+(endTime-startTime));
    }

    public static void main_clone(String[] args) throws CloneNotSupportedException {
        long startTime = new Date().getTime();
        Person p1 = new Person();
        p1.setName("John Goo");
        Address addr = new Address();
        addr.setCountry("中国");
        addr.setCity("深圳");
        addr.setStreet("street");
        p1.setAddr(addr);
        Stamp stamp = new Stamp();
        stamp.setMailCode("0000-000");
        p1.getAddr().setStamp(stamp);
        for (int i = 0; i <1000000000 ; i++) {
            // 6020
            Person p2 = p1.clone();
        }
        long endTime = new Date().getTime();
        System.out.println("total:"+(endTime-startTime));

    }
    public static void main_1(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        p1.setName("John Goo");
        Address addr = new Address();
        addr.setCountry("中国");
        addr.setCity("深圳");
        addr.setStreet("street");
        p1.setAddr(addr);
        Stamp stamp = new Stamp();
        stamp.setMailCode("0000-000");
        p1.getAddr().setStamp(stamp);
        Person p2 = p1.deepClone();
        p2.setName("Tom");
        p2.getAddr().setStreet("街道");
        p2.getAddr().getStamp().setMailCode("111-111");
        System.out.println("P1==>"+p1);
        System.out.println("P2==>"+p2);
    }
}
