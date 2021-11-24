package com.company.ExoBase;
import java.util.concurrent.ThreadLocalRandom;

public class ExoMoyenne {
    public static void main(String args[]) {


        int total =0;
        for(int i = 0; i<5; i++){
            int number = ThreadLocalRandom.current().nextInt(0,100);
            System.out.println(number);
            total += number;
        }
        System.out.println("La moyenne est de " + (double) total/5);
    }
}
