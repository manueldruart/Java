package com.company.LambdaExpressions.ExerciceTimeTask;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherDataGenerator extends Timer {

    private int delay = 0;
    private int interval =2000;
    private TimerTask timerTask;

    public WeatherDataGenerator() {
        this.timerTask = new TimerTask() {
            @Override
            public void run() {
                int temp = getRandom(-10,25);
                int humidite =getRandom(0,100);
                System.out.println("Temp : " + temp);
                System.out.println("humiditee: " + humidite);
            }
        };


        // There is more than one method used so the lambda expression can't be
        // used in this case


        this.schedule(this.timerTask, delay, interval);
    }

    private Random random = new Random();

    private int getRandom(int min, int max) {
    return min + random.nextInt((max-min)+1);
    }
}
