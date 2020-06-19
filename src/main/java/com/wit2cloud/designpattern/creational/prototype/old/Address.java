package com.wit2cloud.designpattern.creational.prototype.old;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

import java.io.Serializable;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Address
 * @Desc: TODO
 * @history v1.0
 */
public class Address implements Serializable {

    private String country;
    private String city;
    private String street;
    private String address;
    private Stamp stamp;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Stamp getStamp() {
        return stamp;
    }

    public void setStamp(Stamp stamp) {
        this.stamp = stamp;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", address='" + address + '\'' +
                ", stamp=" + stamp +
                '}';
    }
}
