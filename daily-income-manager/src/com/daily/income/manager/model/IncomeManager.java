package com.daily.income.manager.model;

import java.sql.Date;

public class IncomeManager {

    private int incomeManagerId;
    private String incomeType;
    private double totalAmount;
    private String paymentType;
    private long partyContactNumber;
    private String partyName;
    private Date paymentDate;

    public int getIncomeManagerId() {
        return incomeManagerId;
    }

    public void setIncomeManagerId(int incomeManagerId) {
        this.incomeManagerId = incomeManagerId;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public long getPartyContactNumber() {
        return partyContactNumber;
    }

    public void setPartyContactNumber(long partyContactNumber) {
        this.partyContactNumber = partyContactNumber;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}