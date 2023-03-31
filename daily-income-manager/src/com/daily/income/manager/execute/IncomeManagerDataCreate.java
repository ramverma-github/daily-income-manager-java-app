package com.daily.income.manager.execute;

import com.daily.income.manager.service.IncomeManagerDataCreateService;
import com.daily.income.manager.service.IncomeManagerDataCreateServiceImpl;

public class IncomeManagerDataCreate {
    public static void main(String[] args) {
        IncomeManagerDataCreateService incomeManagerService = new IncomeManagerDataCreateServiceImpl();
        try {
            incomeManagerService.createData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
