package com.neoteric.jdbcconnectionlatest.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.security.auth.login.AccountException;

public class SpringIocTest {
    public static void main(String[] args) {

       ApplicationContext context=new AnnotationConfigApplicationContext("com.neoteric.jdbcconnectionlatest.springioc");

//        ApplicationContext context=new AnnotationConfigApplicationContext(ExternalJavaService.class);
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
        employeeService.project();
    }


}
