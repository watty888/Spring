package com.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class theFortuneService implements FortuneService {

    private Random randomGenerator;
    private List<String> fortunes = new ArrayList<>();

    public theFortuneService() {
        fortunes.add("Today is your lucky day!");
        fortunes.add("Today is your UNlucky day!");
        fortunes.add("Today is your FUCKING day!");
        fortunes.add("Today is your FUCKING BAD day!");
        fortunes.add("Today is not your FUCKING BAD day!");

        randomGenerator = new Random();
    }

    @Override
    public String getFortune() {
        int index = randomGenerator.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
