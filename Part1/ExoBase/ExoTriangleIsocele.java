package com.company.ExoBase;

import java.util.Scanner;

public class ExoTriangleIsocele {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entre une hauteur");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++){
            for (int j = 0; j < height - i; j++){
                System.out.print(" ");
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
                System.out.println("");
            }
        }
    }
}
