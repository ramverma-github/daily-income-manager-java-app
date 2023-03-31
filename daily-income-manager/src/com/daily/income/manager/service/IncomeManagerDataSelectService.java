package com.daily.income.manager.service;

import com.daily.income.manager.model.IncomeManager;

import java.util.List;

public interface IncomeManagerDataSelectService {
    public void searchIncome(int incomeId);

    public List<IncomeManager> getAllIncomeData();
}
