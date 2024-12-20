package com.neoteric.jdbcconnectionlatest.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    PayService payService;
    public EmployeeService(){
        System.out.println("from constructor  ++++++");
    }

    public void project(){
        System.out.println("from project assignment");
        payService.pay();
    }
}
