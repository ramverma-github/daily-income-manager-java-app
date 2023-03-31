package com.daily.income.manager.model;

public class PaymentType {

    private int paymentTypeId;
    private String paymentDescription;

    public PaymentType(int paymentTypeId, String paymentDescription) {
        this.paymentTypeId = paymentTypeId;
        this.paymentDescription = paymentDescription;
    }

    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }
}
