package com.wit2cloud.designpattern.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: TestPage
 * @Desc: TODO
 * @history v1.0
 */
public class TestPage {
    public static void main(String[] args) {
            Page page = new Page();
            page.totalRow(300).currentPage(12);
            System.out.println(page.getTotalPage());
            System.out.println(page.getFrom());
            System.out.println(page.getTo());

    }
}
