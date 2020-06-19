package com.wit2cloud.designpattern.behavioral.stragety.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: AnimalContext
 * @Desc: TODO
 * @history v1.0
 */
public class AnimalContext {

    private AnimalStrategy strategy;

    public AnimalContext(AnimalStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 切换环境
     * @param strategy
     */
    public void switchContext(AnimalStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行计算
     */
    public void execute(){
        strategy.weight();
        strategy.colorStyle();
        strategy.isFly();
        strategy.eatFood();
    }
}
