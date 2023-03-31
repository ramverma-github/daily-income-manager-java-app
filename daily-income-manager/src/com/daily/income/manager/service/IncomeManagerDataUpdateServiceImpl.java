package com.daily.income.manager.service;

import com.daily.income.manager.helper.JdbcConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class IncomeManagerDataUpdateServiceImpl implements IncomeManagerDataUpdateService {
    @Override
    public void updateIncome(int incomeId) {
        System.out.println("update income data by id "+incomeId);
        try {
            Connection connection = JdbcConnectionHelper.getConnection();
            String UPDATE_QUERY = "UPDATE DAILY_INCOME_MANAGER SET PAYMENT_TYPE= ?, TOTAL_AMOUNT = ? " +
                                    "WHERE INCOME_MANAGER_ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY);
            Scanner sc = new Scanner(System.in);
            System.out.println("Please insert new payment type to update:");
            String paymentType = sc.next();
            preparedStatement.setString(1,paymentType);
            System.out.println("Please insert new amount to update:");
            double newAmount = sc.nextDouble();
            preparedStatement.setDouble(2, newAmount);
            preparedStatement.setInt(3,incomeId);
            int transaction = preparedStatement.executeUpdate();
            if(transaction != 0){
                System.out.println("Record update successfully : "+transaction);
            }else{
                System.out.println("Record not found to update : "+transaction);
            }
        }catch (Exception exp){
            System.out.println("Exception while updating data : "+exp);
        }

    }
}
