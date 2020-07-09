package com.wit2cloud.designpattern.behavioral.memento;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestMemento
 * @Desc: TODO
 * @history v1.0
 */
public class TestMemento {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5,5,careTaker);
        System.out.println(originator);
        System.out.println(" init:"+originator);

        originator.draw("save1",10,19);
        originator.draw("save2",20,29);
        originator.draw("save3",30,39);
        originator.draw("save4",40,50);
        originator.undo();
        originator.undo();
        System.out.println(originator);



    }
}
