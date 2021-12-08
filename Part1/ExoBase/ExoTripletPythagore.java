package com.company.Part1.ExoBase;

import java.util.concurrent.ThreadLocalRandom;

public class ExoTripletPythagore {
    public static void main(String[] args) {
        int i = 0;
        int tried =0;
        while (i <= 8) {
            int number = ThreadLocalRandom.current().nextInt(1, 100);
            int numbersecond = ThreadLocalRandom.current().nextInt(1, 100);
            int numberthird = ThreadLocalRandom.current().nextInt(1, 100);
            tried++;
            if (pythagore(number,numbersecond,numberthird)) {
                System.out.println(number + " " + numbersecond + " " + numberthird + " " + " " + " " + (int) Math.pow(number, 2) + " " + (int) Math.pow(numbersecond, 2) + " " + (int) Math.pow(numberthird, 2));
                i++;
            }
        }
        System.out.println("Number of try is " + tried);
    }
    private static boolean pythagore ( int number, int numbersecond, int numberthird){
        return Math.pow(numberthird, 2) == (Math.pow(number, 2) + Math.pow(numbersecond, 2));
    }
}
