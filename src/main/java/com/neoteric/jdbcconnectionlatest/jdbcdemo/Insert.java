package com.neoteric.jdbcconnectionlatest.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/sonar?user=root & password=12345";
        String insert="insert into employee values(?,?,?,?,?,?,?)";

        try {
            //establishing the connection
            Connection connection = DriverManager.getConnection(url);


            //for creation of platform and taking runtime values
            PreparedStatement ps=connection.prepareStatement(insert);

            //to set the values to the placeholder
            Scanner scan=new Scanner(System.in);

            System.out.println("Enter the employee id:");
            ps.setInt(1,scan.nextInt());

            System.out.println("Enter the employee name:");
            ps.setString(2, scan.next());

            System.out.println("Enter the employee dept:");
            ps.setString(3, scan.next());

            System.out.println("Enter the employee salary:");
            ps.setDouble(4,scan.nextDouble());

            System.out.println("Enter the employee state:");
            ps.setString(5, scan.next());

            System.out.println("Enter the employee pid:");
            ps.setInt(6,scan.nextInt());

            System.out.println("Enter the employee mid:");
            ps.setInt(7,scan.nextInt());

            int resut=ps.executeUpdate();
            if(resut!=0){
                System.out.println("Inserted");
            }
            else{
                System.out.println("No data Inserted ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
