package com.neoteric.jdbcconnectionlatest.jdbc;

import java.sql.*;
import java.util.*;

public class ParamitaraizedDBConnection {
    public static Collection<JDBCProject> namedParameters(String id) throws Exception {

        Collection<JDBCProject> jdbcProjects = new ArrayList<>();
        Map<String, JDBCProject> map = new HashMap<>();
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "12345");

        PreparedStatement stat = con.prepareStatement(id);

        ResultSet resultSet = stat.executeQuery("select * from sonar.employee where id =  " + id);

        while (resultSet.next()) {
            System.out.println("Project name " + resultSet.getString(2) + " Employee name " + resultSet.getString(2));

            if (map.containsKey(resultSet.getString(1))) {
                JDBCProject jdbcProject = map.get(resultSet.getString(1));
                JDBCEmployee employee = new JDBCEmployee();
                employee.setName(resultSet.getString("name"));
                jdbcProject.getJdbcEmployeeList().add(employee);
            } else {
                JDBCEmployee jdbcEmployeeManager = new JDBCEmployee();
                jdbcEmployeeManager.setName(resultSet.getString(1));

                JDBCEmployee jdbcEmployeeManagerTeam = new JDBCEmployee();
                jdbcEmployeeManagerTeam.setName(resultSet.getString(3));

                List<JDBCEmployee> jdbcEmployees = new ArrayList<>();

                jdbcEmployees.add(jdbcEmployeeManagerTeam);
                jdbcEmployeeManager.setJdbcEmployeeList(jdbcEmployees);

//                map.put(resultSet.getString(1),jdbcEmployeeManager);
            }
        }
        jdbcProjects=map.values();
        return jdbcProjects;
    }
}