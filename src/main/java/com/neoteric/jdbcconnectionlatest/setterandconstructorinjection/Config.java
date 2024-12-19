package com.neoteric.jdbcconnectionlatest.setterandconstructorinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("durga")
    public Student getStudent(){
        Address address=new Address();
        address.setPin(43389);
        address.setCity("hyd");
        address.setState("ts");

        Student student=new Student(101,"rama",address);

        return student;
    }
}
