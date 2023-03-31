package com.daily.income.manager.execute;

import com.daily.income.manager.service.IncomeManagerDataUpdateService;
import com.daily.income.manager.service.IncomeManagerDataUpdateServiceImpl;

import java.util.Scanner;

public class IncomeManagerDataUpdate {
    public static void main(String[] args) {
        IncomeManagerDataUpdateService updateService = new IncomeManagerDataUpdateServiceImpl();
        System.out.println("Insert transaction id to update record : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        updateService.updateIncome(id);
    }
}
