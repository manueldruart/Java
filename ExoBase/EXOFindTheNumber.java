package com.company.ExoBase;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EXOFindTheNumber {
    public static void main(String args[]) {


        int enteredNumber;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int number = ThreadLocalRandom.current().nextInt(1, 100);
        System.out.println(number);
        do {
            System.out.println("Enter a number between 1 and 100");
            enteredNumber = sc.nextInt();
            i++; // pour recommencer si le nombre n'est pas trouvé
            if(enteredNumber == number){
                System.out.println("Your entered number is correct");
            } else if (enteredNumber < number){
                System.out.println("The mystery number is higher than your entered number");
            } else {
                System.out.println("The mystery number is lower than your entered number");
            }
        } while (enteredNumber != number && i < 5); // tant que le nombre est différent recommencer max 5x
    }
}
