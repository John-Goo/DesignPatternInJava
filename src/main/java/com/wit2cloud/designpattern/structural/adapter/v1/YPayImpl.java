package com.wit2cloud.designpattern.structural.adapter.v1;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: YPayImpl
 * @Desc: TODO
 * @history v1.0
 */
public class YPayImpl implements YPay {

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return this.cVVNo;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;

    }



    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "YPayImpl{" +
                "custCardNo='" + custCardNo + '\'' +
                ", cardOwnerName='" + cardOwnerName + '\'' +
                ", cardExpMonthDate='" + cardExpMonthDate + '\'' +
                ", cVVNo=" + cVVNo +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
