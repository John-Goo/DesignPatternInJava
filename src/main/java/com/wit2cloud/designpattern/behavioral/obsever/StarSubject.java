package com.wit2cloud.designpattern.behavioral.obsever;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanPropertyBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: StarSubject
 * @Desc: 发布者
 * @history v1.0
 */
public class StarSubject  implements Subject{

    private String msg;
    private List<Observer> observers = new ArrayList<Observer>();

    public void push(String msg) {
        this.msg = msg;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.forEach((observer1 -> {
            if(observer1.equals(observer)){
                observers.remove(observer);
            }
        }));
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(msg);
        });
    }


}
