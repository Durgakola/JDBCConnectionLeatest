package com.neoteric.jdbcconnectionlatest.jdbc;

import java.sql.*;
import java.util.*;

import static java.lang.Class.forName;

public class JdbcConnection {
        public static Collection<JDBCProject> getEmployeeAllocate()  {

                Collection<JDBCProject> jdbcProjects=new ArrayList<>();
                Map<String,JDBCProject> map=new HashMap<>();
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "12345");

                        Statement stat = con.createStatement();

                        ResultSet resultSet = stat.executeQuery("SELECT * FROM sonar.project p cross join sonar.employee e");

                        while (resultSet.next()) {
                                System.out.println("projectId: " + resultSet.getInt(1) + "projectName: " + resultSet.getString(2) +
                                        " startDate: " + resultSet.getDate(3) + "projectenDate: " + resultSet.getDate(4) +
                                        "employeeId: " + resultSet.getInt(5) + "Name: " + resultSet.getString(6) + "Dept: " + resultSet.getString(7) +
                                        "Salary: " + resultSet.getDouble(8) + " State: " + resultSet.getString(9) + "Pid: " + resultSet.getInt(10) +
                                        " Mid: " + resultSet.getInt(11));

                                if(map.containsKey(resultSet.getString(2))){
                                        JDBCProject jdbcProject=map.get(resultSet.getString(2));
                                        JDBCEmployee employee=new JDBCEmployee();
                                        employee.setName(resultSet.getString("name"));
                                        jdbcProject.getJdbcEmployeeList().add(employee);

                                }
                                else{
                                        JDBCProject jdbcProject=new JDBCProject();
                                        jdbcProject.setId(resultSet.getInt(1));
                                        List<JDBCEmployee> jdbcEmployees=new ArrayList<>();
                                        jdbcProject.setJdbcEmployeeList(jdbcEmployees);

                                        jdbcProject.setName(resultSet.getString(2));

                                        JDBCEmployee employee=new JDBCEmployee();
                                        employee.setName(resultSet.getString("name"));

                                        jdbcEmployees.add(employee);


                                        map.put(resultSet.getString(2),jdbcProject );

                                }
                        }



                } catch (Exception e) {
                        System.out.println("Exception occured while fetching data "+e);

                }
                jdbcProjects =map.values();
                return jdbcProjects;
        }
}


