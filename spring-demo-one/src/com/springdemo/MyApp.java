package com.springdemo;

public class MyApp {

    public static void main(String[] args) {
        //create object
        Coach theCoach = new TrackingCoach();

        //use object
        System.out.println(theCoach.getDailyWorkout());
    }

}
