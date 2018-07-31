package com.springdemo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private List<String> theFortunes;

    public FileFortuneService() {
        File theFile = new File("fortune-data.txt");

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        // initialize array list
        theFortunes = new ArrayList<>();

        // read fortunes from file
        try (BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        // pick a random string from the array
        Random myRandom = new Random();
        int index = myRandom.nextInt(theFortunes.size());

        return theFortunes.get(index);
    }
}
