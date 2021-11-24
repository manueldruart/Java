package com.company.ExoBase;

import java.util.Scanner;

public class ExoTriangleIsoclesecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entre une hauteur");
        int rows = sc.nextInt();


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
