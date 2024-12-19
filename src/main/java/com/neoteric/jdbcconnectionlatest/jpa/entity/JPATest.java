package com.neoteric.jdbcconnectionlatest.jpa.entity;

import java.util.List;

public class JPATest {
    public static void main(String[] args) {
//        EmployeeService employeeService = new EmployeeService();
//        List<ProjectEntity> projectList = employeeService.nplusOne();
//
//        for (int i = 0; i < projectList.size(); i++) {
//            System.out.println(" Project  " + projectList.get(i));
//
//            projectList.get(i).getEmployeeEntityList().forEach(emp -> {
//                System.out.println("  emp " + emp);
//            });
//        }
//        System.out.println(projectList);


        List<EmployeeEntity> employeeSalary = EmployeeService.getEmployeesLessSalary(20000);
        employeeSalary.forEach(employee -> System.out.println("Employee Name: " + employee.getName()
                + " Employee Salary" + employee.getSalary()));
    }


//        List<EmployeeEntity> employees=EmployeeService.parameterizedPosition(2);
//        employees.forEach(emp ->{
//            System.out.println(" Employee Name: " + emp.getName());
//        });
//        }


//        List<EmployeeEntity> employees = EmployeeService.employeeState(2);
//        employees.forEach(emp -> {
//            System.out.println("Employee State:  " + emp.getState());
//        });
//    }

}
