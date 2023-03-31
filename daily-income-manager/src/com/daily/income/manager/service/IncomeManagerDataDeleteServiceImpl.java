package com.daily.income.manager.service;

import com.daily.income.manager.helper.JdbcConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class IncomeManagerDataDeleteServiceImpl implements IncomeManagerDataDeleteService {
    @Override
    public void deleteIncome(int incomeId) {
        System.out.println("delete data by id "+incomeId);
        try {
            Connection connection = JdbcConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM DAILY_INCOME_MANAGER WHERE INCOME_MANAGER_ID = ?");
            preparedStatement.setInt(1,incomeId);
            int flag = preparedStatement.executeUpdate();
            if(flag>0){
                System.out.println("Income record deleted : "+flag);
            }else{
                System.out.println("Provided Income Id not available to delete : "+flag);
            }

        }catch (Exception exp){
            System.out.println("Exception to delete record : "+exp);
        }
    }
}
