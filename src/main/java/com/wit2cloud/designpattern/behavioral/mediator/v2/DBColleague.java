package com.wit2cloud.designpattern.behavioral.mediator.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import javax.print.attribute.standard.Media;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: DBColleague
 * @Desc: TODO
 * @history v1.0
 */
public abstract class DBColleague {

    protected Mediator mediator;

    public DBColleague(Mediator mediator) {
        this.mediator = mediator;
    }


    public abstract void save(String data);


    public abstract void receive(String data);


}
