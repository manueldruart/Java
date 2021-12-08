package com.company.Part1.ExoBase;

import java.util.Scanner;

public class ExoOccurences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un original ou une phrase : ");
        String phrase = sc.nextLine();
        System.out.println("Liste de caractères:");
        int i, nombre ;
        char lettre ;



        for (lettre=(char)'A'; lettre<='Z'; lettre++)
        {
            nombre=0;

            for(i=0; i<phrase.length(); i++)
            {
                if (lettre == Character.toUpperCase(phrase.charAt(i)))
                {
                    nombre++;
                }
            }

            if (nombre > 0)
            {

                System.out.println("Le nombre de " + lettre + " est de "+nombre);
            }
        }
    }
}
