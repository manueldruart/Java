package com.company.Cypher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        System.out.println("Veuillez entrer votre offset");
        sc = new Scanner(System.in);
        DecalageStrategy decalageStrategy = new DecalageStrategy(sc.nextInt());
        System.out.println("Veuillez entrer le texte a chiffrer");
        sc = new Scanner(System.in);
        String motChiffre = decalageStrategy.chiffrer(sc.nextLine());
        System.out.println("Voice votre texte chiffré :" + motChiffre);
        System.out.println("-----------------------------");
        String motDechiffre = decalageStrategy.dechiffrer(motChiffre);
        System.out.println("Voici votre text dechiffré : " + motDechiffre);

        System.out.println("partie 2");
        String origin = "abcdefghijklmnopqurstuvxyz123456789";
        String dest ="123456789abcdefghijklmnopqurstuvxyz";
        DicoStrategy dicoStrategy = new DicoStrategy(origin,dest);
        System.out.println("Veuillez entrer le texte a chiffrer");
        sc = new Scanner(System.in);
        String motChiffre2 = dicoStrategy.chiffrer(sc.nextLine());
        System.out.println("Voice votre texte chiffré :" + motChiffre2);
        System.out.println("-----------------------------");
        String motDechiffre2 = dicoStrategy.dechiffrer(motChiffre2);
        System.out.println("Voici votre text dechiffré : " + motDechiffre2);



    }

}
