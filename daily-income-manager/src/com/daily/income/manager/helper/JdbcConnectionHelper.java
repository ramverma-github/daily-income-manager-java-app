package com.daily.income.manager.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionHelper {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
        }catch (Exception exp){
            System.out.println("Exception:::>"+exp);
        }
        return connection;
    }

    public Statement getStatement() throws SQLException, ClassNotFoundException {
        return getConnection().createStatement();
    }
}
