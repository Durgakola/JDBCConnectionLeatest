package com.neoteric.jdbcconnectionlatest.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/sonar?user=root & password=12345";
        String query="insert into employee(id,name,dept,salary,state,pid,mid) values(9,'lakshmi','ECE',15000.0,'Amaravathi',1,4)";

        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement= connection.createStatement();
            int noOfRecordsinsertd= statement.executeUpdate(query);
            System.out.println("Record inserted "+noOfRecordsinsertd);
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
