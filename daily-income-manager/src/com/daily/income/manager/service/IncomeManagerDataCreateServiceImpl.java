package com.daily.income.manager.service;

import com.daily.income.manager.helper.JdbcConnectionHelper;
import com.daily.income.manager.model.IncomeManager;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncomeManagerDataCreateServiceImpl implements IncomeManagerDataCreateService {
    @Override
    public void createData() {
        try {
            Connection connection = JdbcConnectionHelper.getConnection();
            String INSERT_SQL = null;
            List<IncomeManager> incomeManagerList = createIncomeManagerData();
            String INSERT_QUERY = "INSERT INTO DAILY_INCOME_MANAGER VALUES (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
            for (IncomeManager manager : incomeManagerList) {
                int newPrimaryId = getCreateNewManagerId();
                System.out.println("New data id: " + newPrimaryId);
                preparedStatement.setInt(1, newPrimaryId);
                preparedStatement.setString(2, manager.getIncomeType());
                preparedStatement.setDouble(3, manager.getTotalAmount());
                preparedStatement.setString(4, manager.getPaymentType());
                preparedStatement.setLong(5, manager.getPartyContactNumber());
                preparedStatement.setString(6, manager.getPartyName());
                preparedStatement.setDate(7, Date.valueOf(LocalDate.now()));
                preparedStatement.execute();
                System.out.println("data created successfully!!!");
            }
        } catch (Exception exp) {
            System.out.println("Exception occurred while create data: " + exp);
        }
        System.out.println("Done!!!!");

    }
    @Override
    public List<IncomeManager> createIncomeManagerData() {
        List<IncomeManager> incomeManagerList = new ArrayList<>();
        IncomeManager incomeManager = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many data you want to create");
        int len = sc.nextInt();
        for (int i = 1; i <= len; i++) {
            incomeManager = new IncomeManager();
            System.out.println("Insert IncomeType:");
            String incomeTypeDes = sc.next();
            incomeManager.setIncomeType(incomeTypeDes);

            System.out.println("Insert PaymentType:");
            String paymentTypeDes = sc.next();
            incomeManager.setPaymentType(paymentTypeDes);

            System.out.println("Insert total amount:");
            incomeManager.setTotalAmount(sc.nextInt());

            System.out.println("Insert Party Contact Number:");
            incomeManager.setPartyContactNumber(sc.nextLong());

            System.out.println("Insert Party Name:");
            incomeManager.setPartyName(sc.next());
            incomeManagerList.add(incomeManager);
        }
        return incomeManagerList;
    }

    public int getCreateNewManagerId() throws SQLException {
        Connection connection = JdbcConnectionHelper.getConnection();
        Statement statement = connection.createStatement();
        String SELECT_SQL = "SELECT * FROM DAILY_INCOME_MANAGER ORDER BY INCOME_MANAGER_ID DESC";
        ResultSet resultSet = statement.executeQuery(SELECT_SQL);
        int currentId = 0;
        while (resultSet.next()) {
            currentId = resultSet.getInt(1);
            System.out.println("Current ID : "+currentId);
            break;
        }
        return currentId + 1;
    }

}
