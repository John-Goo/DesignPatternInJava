package com.wit2cloud.designpattern.creational.builder.t2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Form
 * @Desc: TODO
 * @history v1.0
 */
public class Form {
    private String name;
    private String address;
    private String job;
    private String email;

    public Form(FormBuilder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.job = builder.job;
        this.email = builder.email;
    }
    public static FormBuilder builder(){
        return  new FormBuilder();
    }

    public static class FormBuilder {
        private String name;
        private String address;
        private String job;
        private String email;

        public FormBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FormBuilder address(String address) {
            this.address = address;
            return this;
        }

        public FormBuilder job(String job) {
            this.job = job;
            return this;
        }

        public FormBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Form build(){
            return new Form(this);
        }


    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                '}';
    }



}
