package com.neoteric.jdbcconnectionlatest.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    ExternalJavaService externalJavaService;
    public PayService (@Autowired ExternalJavaService externalJavaService){
        this.externalJavaService=externalJavaService;

    }

//    public PayService(){
//        System.out.println("from payservice constructor");
//    }
    public void pay(){
        System.out.println("they are pay");
        externalJavaService.external();
    }
}
