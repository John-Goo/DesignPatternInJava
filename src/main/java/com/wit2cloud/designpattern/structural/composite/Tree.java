package com.wit2cloud.designpattern.structural.composite;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Tree
 * @Desc: 整体与部分的关系
 * @history v1.0
 */
public class Tree extends Component {

    protected List<Component> branchList =  new ArrayList<>();

    public Tree(String nodeName) {
        super(nodeName);
        if(nodeName==null){
            this.nodeName =" Tree";
        }
    }

    @Override
    public void add(Component child) {
        branchList.add(child);
    }

    @Override
    public void remove(Component child) {
        for(Component c:branchList){
            if(c == child){
                branchList.remove(child);
            }
        }
    }
    @Override
    public Component getChild(int index) {
        return branchList.get(index);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "branchList=" + branchList +
                ", nodeName='" + nodeName + '\'' +
                '}';
    }
}
