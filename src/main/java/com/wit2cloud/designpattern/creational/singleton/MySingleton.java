package com.wit2cloud.designpattern.creational.singleton;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import java.util.HashMap;
import java.util.Map;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: MySingleton
 * @Desc: TODO
 * @history v1.0
 */
public class MySingleton {

    private static MySingleton mySingleton;
    private  static Object lock = new Object();
    private Map<String,String> data = new HashMap<>();

    private MySingleton(){
    }

    public static MySingleton getInstance(){
        if(mySingleton ==null){
            synchronized (lock){
                if(mySingleton ==null){
                    mySingleton = new MySingleton();
                }
            }
        }
        return mySingleton;
    }

    public void put(String key,String value){
        data.put(key,value);
    }

    public String get(String key){
      return data.get(key);
    }




}
