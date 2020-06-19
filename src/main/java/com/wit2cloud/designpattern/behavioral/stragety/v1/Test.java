package com.wit2cloud.designpattern.behavioral.stragety.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Test
 * @Desc: TODO
 * @history v1.0
 */
public class Test {

    public static AnimalInterface  getAnimal(String animalType){

        if("dog".equals(animalType)){
            return  new DogImpl();
        }else if ("cat".equals(animalType)){
            return new CatImpl();
        }else if ("pig".equals(animalType)){
            return  new PigImpl();
        }else if ("duck".equals(animalType)){
            return  new DuckImpl();
        }else{
            throw new RuntimeException("**您输入的动物类型不存在！animalType："+animalType);
        }

    }

    public static void main(String[] args) {

        AnimalInterface animal = getAnimal("duck");
        animal.weight();
        animal.colorStyle();
        animal.isFly();
        animal.eatFood();
        System.out.println("------------------");
        animal = getAnimal("dog");
        animal.weight();
        animal.colorStyle();
        animal.isFly();
        animal.eatFood();  System.out.println("------------------");
        animal = getAnimal("cat");
        animal.weight();
        animal.colorStyle();
        animal.isFly();
        animal.eatFood();

        animal.eatFood();  System.out.println("------------------");
        animal = getAnimal("pig");
        animal.weight();
        animal.colorStyle();
        animal.isFly();
        animal.eatFood();

    }
}
