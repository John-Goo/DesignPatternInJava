package com.wit2cloud.designpattern.behavioral.state.refer.x1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课堂
 ==========================================================================*/

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
        System.out.println(">>>"+state);
        Context context = new Context(state);
        DaySession.setCtx(context);
       // DaySession.setNowtime(9);

        System.out.println("=== m1 ==========");
        //context.doWork();
        System.out.println("=== m2 ==========");
        System.out.println("-----------");

        DaySession.setNowtime(23);
       // context.doWork();
        Scanner sc=new Scanner(System.in);
        while (true){
            int j=sc.nextInt();
            DaySession.setNowtime(j);
        }

    }
}
