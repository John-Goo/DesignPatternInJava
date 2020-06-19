package com.wit2cloud.designpattern.structural.composite;
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
    public static void main(String[] args) {
        Tree tree = new Tree("白杨树");
        Branch branch1 = new Branch("树干1");
        Branch branch2 = new Branch("树干2");
        Branch branch3 = new Branch("树干3");
        // 组装，部分与整体的关系
        tree.add(branch1);
        tree.add(branch2);
        tree.add(branch3);

        Leaf leaf1 = new Leaf("树叶1");
        Leaf leaf2 = new Leaf("树叶2");
        Leaf leaf3 = new Leaf("树叶3");
        /*
        * 叶子挂在树枝上，表示整体与局部的关系
        * */
        branch1.add(leaf1);
        branch1.add(leaf2);
        branch2.add(leaf3);

        System.out.println(tree);




    }
}
