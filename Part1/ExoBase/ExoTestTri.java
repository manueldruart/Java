package com.company.ExoBase;

import java.util.Arrays;
import java.util.Scanner;

public class ExoTestTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entre un nbre");
        int enteredNumber = sc.nextInt();

        for(int a = 1 ; a <= enteredNumber; a++)
        {
            for(int b = 1; b <= enteredNumber; b++)
            {
                System.out.print(a * b + " ");
            }
            System.out.println();
        }
    }
}
