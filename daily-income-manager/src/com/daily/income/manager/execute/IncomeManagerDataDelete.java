package com.daily.income.manager.execute;

import com.daily.income.manager.service.IncomeManagerDataDeleteService;
import com.daily.income.manager.service.IncomeManagerDataDeleteServiceImpl;

import java.util.Scanner;

public class IncomeManagerDataDelete {
    public static void main(String[] args) {
        IncomeManagerDataDeleteService deleteService = new IncomeManagerDataDeleteServiceImpl();
        System.out.println("Insert transaction id to delete record : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        deleteService.deleteIncome(id);
    }
}
