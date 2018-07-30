package com.springdemo;

public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 4 circles around the field";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
