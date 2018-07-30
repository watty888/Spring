package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean form spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        //call new method
        System.out.println(theCoach.getDailyFortune());
        //close context
        context.close();
    }

}
