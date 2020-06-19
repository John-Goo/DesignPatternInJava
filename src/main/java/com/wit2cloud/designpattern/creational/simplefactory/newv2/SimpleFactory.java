package com.wit2cloud.designpattern.creational.simplefactory.newv2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: SimpleFactory
 * @Desc: 统一产生实例对象
 * @history v1.0
 */
public class SimpleFactory {

    ThreadLocal<Fruit> tl = new ThreadLocal<>();

    /**
     * 创建实例对象
     * @param type
     * @return
     */
    public Fruit createFruit(String type) {
        Fruit fruit = generateFruit(type);
        return fruit;
    }

    public SimpleFactory newInstance(String type){
        Fruit fruit = generateFruit(type);
        tl.set(fruit);
        return this;
    }

    private Fruit generateFruit(String type) {
        Fruit fruit = null;
        switch (type) {
            case "apple":
                fruit = new AppleFruit();
                break;
            case "banana":
                fruit = new BananaFruit();
                break;
            case "orange":
                fruit = new OrangeFruit();
                break;
            default:
                System.out.println(" 水果类型不存在！");
        }
        return fruit;
    }


    public void display(){
        Fruit fruit = tl.get();
        if(fruit != null) {
            fruit.plant();
            fruit.water();
            fruit.pick();
        }
        // 清空缓存
        tl.set(null);
    }

}
