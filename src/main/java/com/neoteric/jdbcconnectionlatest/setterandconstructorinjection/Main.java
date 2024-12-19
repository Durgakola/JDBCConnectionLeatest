package com.neoteric.jdbcconnectionlatest.setterandconstructorinjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("injection.xml");
        Student s1=(Student) ap.getBean("id3");
        Student s2=(Student) ap.getBean("id4");
        System.out.println(s1);
        System.out.println(s2);

        ApplicationContext app=new AnnotationConfigApplicationContext(Config.class);
        Student stu=(Student) app.getBean("durga");
        System.out.println(stu);


    }
}
