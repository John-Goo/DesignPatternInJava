package com.wit2cloud.designpattern.behavioral.memento;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Originator
 * @Desc: TODO
 * @history v1.0
 */
public class Originator {

    private int x;
    private int y;

    //保存最后一次名称
    private String preNext;
    private String currPointName;

    private CareTaker careTaker;

    public Originator(int x, int y, CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        draw("init",this.x,this.y);
}

    public void draw(String currentPointName,int x,int y) {
        this.x  = x;
        this.y  = y;
        careTaker.save(currentPointName, new Memento(this.x, this.y));
        this.preNext = this.currPointName;
        this.currPointName = currentPointName;
    }


    public void undo() {
        setOriginateState(preNext);
    }

    public void undo(String pointName) {
        setOriginateState(pointName);
    }

    public void undoAll() {
        setOriginateState("init");
        careTaker.clearAll();
    }


    private void setOriginateState(String pointName) {
        Memento memento = careTaker.get(pointName);
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
