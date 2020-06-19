package com.wit2cloud.designpattern.structural.adapter.v2;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 慧云数字课程
 ==========================================================================*/

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: XPayImpl
 * @Desc: TODO
 * @history v1.0
 */
// Adaptee
public class XPayImpl implements XPay {
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }
    @Override
    public String getCustomerName() {
        return customerName;
    }
    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }
    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }
    @Override
    public Short getCardCVVNo() {
        return cardCVVNo;
    }
    @Override
    public Double getAmount() {
        return amount;
    }
    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }
    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }
    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }
    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "XPayImpl{" +
                "creditCardNo='" + creditCardNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", cardExpMonth='" + cardExpMonth + '\'' +
                ", cardExpYear='" + cardExpYear + '\'' +
                ", cardCVVNo=" + cardCVVNo +
                ", amount=" + amount +
                '}';
    }
}