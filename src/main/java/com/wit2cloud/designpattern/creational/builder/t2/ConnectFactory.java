package com.wit2cloud.designpattern.creational.builder.t2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: ConnectFactory
 * @Desc: Factory简单工厂+builder模式
 * @history v1.0
 */
public class ConnectFactory {

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

        private MyClientImpl client= new MyClientImpl();

        public Builder ip(String ip){
            client.setIp(ip);
            return this;
        }

        public Builder port(String port){
            client.setPort(port);
            return this;
        }

        public Builder author(String author){
            client.setAuthor(author);
            return this;
        }

        public Builder usrName(String usrName){
            client.setUsrName(usrName);
            return this;
        }
        public Builder password(String pwd){
            client.setPassword(pwd);
            return this;
        }

        public MyClient build(){
            return client;
        }






    }
}
