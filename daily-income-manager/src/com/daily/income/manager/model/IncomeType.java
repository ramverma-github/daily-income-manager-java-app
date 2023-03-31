package com.daily.income.manager.model;

public class IncomeType {

    private int incomeTypeId;
    private String incomeDescription;

    public IncomeType(int incomeTypeId, String incomeDescription) {
        this.incomeTypeId = incomeTypeId;
        this.incomeDescription = incomeDescription;
    }

    public int getIncomeTypeId() {
        return incomeTypeId;
    }

    public void setIncomeTypeId(int incomeTypeId) {
        this.incomeTypeId = incomeTypeId;
    }

    public String getIncomeDescription() {
        return incomeDescription;
    }

    public void setIncomeDescription(String incomeDescription) {
        this.incomeDescription = incomeDescription;
    }
}
