package com.company.Part1.ExoBase;
import java.util.concurrent.ThreadLocalRandom;
public class LoopIntGeneratorFactoriel {

    public static void main(String args[]){

        int number = ThreadLocalRandom.current().nextInt(0,200);
        System.out.println(number);
        int result = 1;
        for (int i =1; i< number; i++){
            result *=i;
        }
        System.out.println(result);






    }
}
