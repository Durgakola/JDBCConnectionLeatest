package com.neoteric.jdbcconnectionlatest.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/sonar?user=root & password=12345";
        String query="insert into employee(id,name,dept,salary,state,pid,mid) values(16,'ramana','ECE',18000.0,'ragu',1,2)";

        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement= connection.createStatement();
            int noOfRecordsinserted= statement.executeUpdate(query);
            System.out.println("Record inserted "+noOfRecordsinserted);
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
