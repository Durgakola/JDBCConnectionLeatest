package com.neoteric.jdbcconnectionlatest.springioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCoreConfiguration {

    @Bean
    public ExternalJavaService getExternalJavaService(){
        return new ExternalJavaService();
    }
}
