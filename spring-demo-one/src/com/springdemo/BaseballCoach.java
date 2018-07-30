package com.springdemo;

public class BaseballCoach implements Coach {

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        //use my fortune service to get fortune
        return fortuneService.getFortune();
    }

}
