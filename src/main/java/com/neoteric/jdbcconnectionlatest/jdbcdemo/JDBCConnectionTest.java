package com.neoteric.jdbcconnectionlatest.jdbcdemo;

import java.sql.*;


public class JDBCConnectionTest {
     private static String URL = "jdbc:mysql://localhost:3306/sonar";
    private static String USER = "root";
    private static String PASSWORD = "12345";

    public static void main(String[] args) {
        try {
            Connection connection  = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connected to the database");

            // Read
            readRecords(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void readRecords(Connection connection) {
        String selectSQL = "SELECT * FROM employee";
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("dept");
                Double salary = rs.getDouble("salary");
                String state = rs.getString("state");
                int pid = rs.getInt("pid");
                int mid = rs.getInt("mid");

                System.out.printf("ID: %d, Name: %s, Dept: %s, Salary: %.2f, State: %s, Pid: %d, Mid: %d%n",
                        id, name, dept, salary, state, pid, mid);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
