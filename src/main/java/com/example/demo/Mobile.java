package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile  {
    public static void main(String[]args){

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        // System.out.println("Config loaded");
        //SpringApplication.run(AddOnProj2Application.class, args);
        Airtel airtel = (Airtel) context.getBean("airBean");
        airtel.data();
        airtel.calling();



    }
}
