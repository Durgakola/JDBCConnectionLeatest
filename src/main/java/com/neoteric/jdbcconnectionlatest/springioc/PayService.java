package com.neoteric.jdbcconnectionlatest.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    @Autowired
    ExternalJavaService externalJavaService;
    public PayService (ExternalJavaService externalJavaService){
        this.externalJavaService=externalJavaService;

    }

    public void pay(){
        System.out.println("they are pay");
        externalJavaService.external();
    }
}
