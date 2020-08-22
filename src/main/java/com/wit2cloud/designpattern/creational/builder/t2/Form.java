package com.wit2cloud.designpattern.creational.builder.t2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
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
    private String email;
    private String job;
    private String addr;

    public Form(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.job = builder.job;
        this.addr = builder.addr;
    }

    /**
     * 外部访问的入口
     * @return
     */
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private String email;
        private String job;
        private String addr;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder job(String job) {
            this.job = job;
            return this;
        }
        public Builder addr(String addr) {
            this.addr = addr;
            return this;
        }

        public Form build(){
            return  new Form(this);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
