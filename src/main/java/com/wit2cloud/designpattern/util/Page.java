package com.wit2cloud.designpattern.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: Page
 * @Desc: TODO
 * @history v1.0
 */
public class Page {

    private int totalRow;
    // 每页条数，默认20条
    private int pageSize = 20;
    private int totalPage;
    private int from;
    private int to;
    private int currentPage;

    public Page totalRow(int totalRow) {
        this.totalRow = totalRow;
        return this;
    }

    public Page pageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    public Page totalPage() {
        totalPage = (totalRow - 1) / pageSize + 1;
        return this;
    }


    public void currentPage(int currentPage) {
        this.totalPage();
        if(currentPage > totalPage){
            throw new RuntimeException(">>> 分页发生异常，当前页大于总分页数！");
        }
        this.currentPage = currentPage;
        // 游标-开始
        this.from = (currentPage - 1) * pageSize;
        // 游标-结束
        this.to   = (currentPage - 1) * pageSize + (pageSize - 1);
        if(this.to > totalRow){
            this.to = totalRow;
        }


    }

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
