package com.neoteric.jdbcconnectionlatest.jpaentity;


import java.util.List;

public class JPATest {
        public static void main(String[] args) {
            EmployeeService employeeService = new EmployeeService();

            // Self-join example
            System.out.println("Employees with the same manager:");
            List<Employee> employeesWithSameManager = employeeService.findEmployeesWithSameManager();
            employeesWithSameManager.forEach(System.out::println);

            // Left join example
            System.out.println("\nProjects with their employees (left join):");
            List<Project> projectsWithEmployees = employeeService.findProjectsWithEmployeesLeftJoin();
            projectsWithEmployees.forEach(System.out::println);

            // Right join example
            System.out.println("\nEmployees with their projects (right join):");
            List<Object[]> employeesWithProjects = employeeService.findEmployeesWithProjectsRightJoin();
            employeesWithProjects.forEach(row -> System.out.println("Employee: " + row[0] + ", Project: " + row[1]));
        }
    }
