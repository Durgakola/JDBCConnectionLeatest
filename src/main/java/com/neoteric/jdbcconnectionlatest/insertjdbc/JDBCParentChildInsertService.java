package com.neoteric.jdbcconnectionlatest.insertjdbc;



import java.sql.*;
import java.util.List;

public class JDBCParentChildInsertService {
    public int getMaxId(String query) {

        int max = 0;
        Connection con;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "12345");

            preparedStatement = con.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {
                max = resultSet.getInt(1) + 1;
            } else {
                max = 1;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return max;
    }

    public void insertEmp(Employee employee) {
        Connection con;
        PreparedStatement psmt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "12345");
            psmt = con.prepareStatement("insert into sonar.employee_latest(id,name,dept,salary,state)" + " values(?,?,?,?,?)");
            psmt.setInt(1, employee.getId());
            psmt.setString(2, employee.getName());
            psmt.setString(3, employee.getDept());
            psmt.setDouble(4, employee.getSalary());
            psmt.setString(5, employee.getState());


            boolean status = psmt.execute();
            if (status) {
                System.out.println("Insert is successful....");
            } else {
                System.out.println("Insert Failed........");
            }
        } catch (Exception e) {

        }
    }

    public void insertProject(Project project) {
        Connection con;
        PreparedStatement preparedStatement;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "user=root", "password=12345");
            preparedStatement = con.prepareStatement("insert into sonar.project_latest(id,name,startdate,enddate)" + "values(?,?,?,?)");
            preparedStatement.setInt(1, project.getId());
            preparedStatement.setString(2, project.getName());
            preparedStatement.setDate(3, new Date(project.getStartDate().getTime()));
            preparedStatement.setDate(4, new Date(project.getEndDate().getTime()));
            boolean status = preparedStatement.execute();
            if (status) {
                System.out.println("Insert is successful....");
            } else {
                System.out.println("Insert Failed........");
            }
        } catch (Exception e) {

        }
    }
    public void saveProjectEmp(List<Project> projects) {
        // itrate the project
        for(int i=0;i<projects.size();i++){
            Project project=projects.get(i);

        //getmax pid from I need pass query
            int maxIdOfProjectId=getMaxId("select max(id) from sonar.project_latest");
            project.setId(maxIdOfProjectId);

        //insert project into table
            insertProject(project);
          //  Thread.sleep();
//            Thread.sleep(6000);

            project.getEmployeeList().forEach(emp-> {
                //get max of employee
                int maxIdOfEmpId = getMaxId("select max(id) from sonar.employee_latest");
                emp.setId(maxIdOfEmpId);
                emp.setPid(project.getId());

                //insert employee
                insertEmp(emp);
            });
        }
    }
}
