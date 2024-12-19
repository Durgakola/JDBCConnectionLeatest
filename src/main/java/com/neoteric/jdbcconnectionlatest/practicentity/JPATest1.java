package com.neoteric.jdbcconnectionlatest.practicentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JPATest1 {
    public static void main(String[] args) {


        List<Project> projectList = new ArrayList<>();
        Project avoota = new Project();
        avoota.setName("avoota");
        avoota.setStartDate(new Date());
        avoota.setEndDate(new Date());


        Employee arun = new Employee();
        arun.setDept("IT");
        arun.setSalary(30000);
        arun.setState("TG");
        arun.setName("Arun");

        avoota.getEmployeeList().add(arun);

        Employee rakesh = new Employee();
        rakesh.setDept("IT");
        rakesh.setSalary(40000);
        rakesh.setState("TG");
        rakesh.setName("Rakesh");
        avoota.getEmployeeList().add(rakesh);

        Employee prasanna = new Employee();
        prasanna.setDept("IT");
        prasanna.setSalary(50000);
        prasanna.setState("TG");
        prasanna.setName("Prasanna");
        avoota.getEmployeeList().add(prasanna);

        Project plumsoft = new Project();
        plumsoft.setName("CRM");
        plumsoft.setStartDate(new Date());
        plumsoft.setEndDate(new Date());

        Employee tarun = new Employee();
        tarun.setDept("CSC");
        tarun.setSalary(30000);
        tarun.setState("TG");
        tarun.setName("Tarun");

        plumsoft.getEmployeeList().add(tarun);

        Employee sukumar = new Employee();
        sukumar.setDept("CSC");
        sukumar.setSalary(40000);
        sukumar.setState("TG");
        sukumar.setName("Sukumar");
        plumsoft.getEmployeeList().add(sukumar);

        Employee ganesh = new Employee();
        ganesh.setDept("CSC");
        ganesh.setSalary(50000);
        ganesh.setState("TG");
        ganesh.setName("Ganesh");
        plumsoft.getEmployeeList().add(ganesh);

        projectList.add(avoota);
        projectList.add(plumsoft);


        JPAService jpaService=new JPAService();
//        List<ProjectOneToManyEntity> projectEntity=jpaService.getEmpProjectMap();
//
//        for (int i = 0; i < projectList.size(); i++) {
//            System.out.println(" Project  " + projectList.get(i));
//
//            projectList.get(i).getEmployeeList().forEach(emp -> {
//                System.out.println("  emp " + emp);
//            });
//        }
    //    System.out.println(projectList);
        for (int i=0;i<projectList.size();i++){
            jpaService.saveJpa(projectList.get(i));
        }

    }
}
