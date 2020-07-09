package com.wit2cloud.designpattern.behavioral.memento;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import java.util.HashMap;
import java.util.Map;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: CareTaker
 * @Desc: TODO
 * @history v1.0
 */
public class CareTaker {

    private Map<String, Memento> pointStorage = new HashMap<>();

    public void save(String key, Memento memento){
        pointStorage.put(key,memento);
    }

    public Memento get(String pointName){
        return pointStorage.get(pointName);
    }

    public void clearAll(){
        pointStorage.clear();
    }





}
