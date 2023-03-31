package com.daily.income.manager.service;

import com.daily.income.manager.model.IncomeManager;

import java.sql.SQLException;
import java.util.List;

public interface IncomeManagerDataCreateService {
    public void createData() throws SQLException, ClassNotFoundException;
    public List<IncomeManager> createIncomeManagerData();

}
