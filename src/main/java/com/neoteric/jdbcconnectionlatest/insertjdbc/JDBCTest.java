package com.neoteric.jdbcconnectionlatest.insertjdbc;

import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCTest {
    public static void main(String[] args) {

        List<Project> projectList=new ArrayList<>();
        Project google=new Project();
        google.setName("Google");
        google.setStartDate(new Date());
        google.setEndDate(new Date());


        Project plumsoft=new Project();
        plumsoft.setName("CRM");
        plumsoft.setStartDate(new Date());
        plumsoft.setEndDate(new Date());

        Employee chandra=new Employee();
        chandra.setId(17);
        chandra.setDept("CSE");
        chandra.setSalary(30000.0);
        chandra.setState("AP");
        chandra.setName("Kusuma");
        plumsoft.getEmployeeList().add(chandra);


        Employee kusuma=new Employee();
        kusuma.setDept("CSE");
        kusuma.setSalary(30000.0);
        kusuma.setState("AP");
        kusuma.setName("Kusuma");
        plumsoft.getEmployeeList().add(kusuma);

        Employee ramu=new Employee();
        ramu.setDept("ECE");
        ramu.setSalary(40000.0);
        ramu.setState("AP");
        ramu.setName("Ramu");
        plumsoft.getEmployeeList().add(ramu);

        Employee rakesh=new Employee();

        rakesh.setDept("CSE");
        rakesh.setSalary(50000.0);
        rakesh.setState("AP");
        rakesh.setName("Rakesh");
        google.getEmployeeList().add(rakesh);

        Employee raki=new Employee();

        raki.setDept("CSE");
        raki.setSalary(38000.0);
        raki.setState("AP");
        raki.setName("Raki");
        google.getEmployeeList().add(raki);

        Employee naagesh=new Employee();
        naagesh.setDept("CSE");
        naagesh.setSalary(10000.0);
        naagesh.setState("AP");
        naagesh.setName("Naagesh");
        google.getEmployeeList().add(naagesh);

        projectList.add(google);
        projectList.add(plumsoft);


        JDBCParentChildInsertService  jdbcParentChildInsertService=new JDBCParentChildInsertService();
        jdbcParentChildInsertService.saveProjectEmp(projectList);


    }

}
