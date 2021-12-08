package com.company.Part1.ExoBase;

import java.util.Scanner;

public class ExoNbrPremier {
    public static void main(String args[]){
        int enteredNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        enteredNumber = sc.nextInt();
        for (int i = 0; i <= enteredNumber; i++) {
            if (isPremier(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPremier(int nbr) {
        boolean flag = true;
        int reste;
        for(int i = 2; i <= nbr/2; i++){
            reste = nbr%i;
            if (reste==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
