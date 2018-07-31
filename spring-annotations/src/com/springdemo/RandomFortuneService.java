package com.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    // create an array of strings
    private String[] data = {
            "Beware of wolf in ship's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    // random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick random string from an array
        int index = myRandom.nextInt(data.length);

        return data[index];
    }
}
