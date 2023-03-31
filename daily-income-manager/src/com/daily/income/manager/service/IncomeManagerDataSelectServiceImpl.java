package com.daily.income.manager.service;

import com.daily.income.manager.helper.JdbcConnectionHelper;
import com.daily.income.manager.model.IncomeManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IncomeManagerDataSelectServiceImpl implements IncomeManagerDataSelectService {
    @Override
    public void searchIncome(int incomeId) {
        System.out.println(" searchIncome data by id "+incomeId);

        JdbcConnectionHelper connectionHelper = new JdbcConnectionHelper();
        Connection connection = connectionHelper.getConnection();
    }

    @Override
    public List<IncomeManager> getAllIncomeData() {
        Connection connection = JdbcConnectionHelper.getConnection();
        List<IncomeManager> incomeDataList = new ArrayList<>();
        IncomeManager incomeManager = null;
         try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM DAILY_INCOME_MANAGER ORDER BY INCOME_MANAGER_ID DESC");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                incomeManager = new IncomeManager();
                incomeManager.setIncomeManagerId(resultSet.getInt(1));
                incomeManager.setIncomeType(resultSet.getString(2));
                incomeManager.setTotalAmount(resultSet.getDouble(3));
                incomeManager.setPaymentType(resultSet.getString(4));
                incomeManager.setPartyContactNumber(resultSet.getLong(5));
                incomeManager.setPartyName(resultSet.getString(6));
                incomeManager.setPaymentDate(resultSet.getDate(7));
                incomeDataList.add(incomeManager);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
         return incomeDataList;
    }
}
