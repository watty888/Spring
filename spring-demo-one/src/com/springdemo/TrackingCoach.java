package com.springdemo;

public class TrackingCoach implements Coach {

    private FortuneService fortuneService;

    public TrackingCoach(){}
    public TrackingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It " + fortuneService.getFortune();
    }
}
