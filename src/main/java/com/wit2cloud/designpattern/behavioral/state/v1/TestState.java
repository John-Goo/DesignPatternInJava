package com.wit2cloud.designpattern.behavioral.state.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

import com.wit2cloud.designpattern.behavioral.state.refer.x1.DaySession;

import java.util.Scanner;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestState
 * @Desc: TODO
 * @history v1.0
 */
public class TestState {

    public static void main(String[] args) throws InterruptedException {


        State state = DayTypeEnum.DAY.value;
        Context context = new Context(state);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("请输入时间：");
            int nowtime = scanner.nextInt();
            context.modify(nowtime);
            context.doWork();
        }

    }
}
