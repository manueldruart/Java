package com.company.Stream.ExercicesImmobilier;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Biens> biens  = new ArrayList<>();
        biens.add(new Biens(100,100000,5,TypeDeBiens.APPARTEMENT,"Mons"));
        biens.add(new Biens(150,150000,8,TypeDeBiens.APPARTEMENT,"Mons"));
        biens.add(new Biens(200,200000,6,TypeDeBiens.APPARTEMENT,"Mons"));
        biens.add(new Biens(500,130000,2,TypeDeBiens.MAISON,"Mons"));
        biens.add(new Biens(150,180000,3,TypeDeBiens.MAISON,"Mons"));
        biens.add(new Biens(200,220000,4,TypeDeBiens.MAISON,"Mons"));
        biens.add(new Biens(35,50000,4,TypeDeBiens.KOT,"Mons"));
        biens.add(new Biens(40,55000,4,TypeDeBiens.KOT,"Mons"));
        biens.add(new Biens(45,60000,4,TypeDeBiens.KOT,"Mons"));
        biens.add(new Biens(70,110000,5,TypeDeBiens.APPARTEMENT,"Liege"));
        biens.add(new Biens(65,100000,11,TypeDeBiens.APPARTEMENT,"Liege"));
        biens.add(new Biens(80,135000,7,TypeDeBiens.APPARTEMENT,"Liege"));
        biens.add(new Biens(120,160000,9,TypeDeBiens.MAISON,"Liege"));
        biens.add(new Biens(150,180000,4,TypeDeBiens.MAISON,"Liege"));
        biens.add(new Biens(200,235000,15,TypeDeBiens.MAISON,"Liege"));
        biens.add(new Biens(40,60000,15,TypeDeBiens.KOT,"Liege"));
        biens.add(new Biens(50,65000,15,TypeDeBiens.KOT,"Liege"));
        biens.add(new Biens(55,75000,15,TypeDeBiens.KOT,"Liege"));
        biens.add(new Biens(70,100000,3,TypeDeBiens.APPARTEMENT,"Bruxelles"));
        biens.add(new Biens(80,120000,2,TypeDeBiens.APPARTEMENT,"Bruxelles"));
        biens.add(new Biens(90,140000,1,TypeDeBiens.APPARTEMENT,"Bruxelles"));
        biens.add(new Biens(110,180000,1,TypeDeBiens.MAISON,"Bruxelles"));
        biens.add(new Biens(120,200000,2,TypeDeBiens.MAISON,"Bruxelles"));
        biens.add(new Biens(140,220000,3,TypeDeBiens.MAISON,"Bruxelles"));
        biens.add(new Biens(40,85000,1,TypeDeBiens.KOT,"Bruxelles"));
        biens.add(new Biens(50,90000,2,TypeDeBiens.KOT,"Bruxelles"));
        biens.add(new Biens(55,100000,2,TypeDeBiens.KOT,"Bruxelles"));

        // 1. N'afficher que les appartements

        System.out.println("EXERCICE 1");
        System.out.println("---------------------");
        List<Biens> biensAppart = biens.stream()
                .filter(biens1 -> biens1.getTypeBiens()==TypeDeBiens.APPARTEMENT  )
                .collect(Collectors.toList());
        System.out.println(biensAppart);
        System.out.println("");


        // 2. Afficher tous les batiments sauf les appart sup a 5000E

        System.out.println("EXERCICE 2");
        System.out.println("---------------------");
        List<Biens> biensSaufAppartInf5000 = biens.stream()
                .filter(biens1 -> !(biens1.getTypeBiens()==TypeDeBiens.APPARTEMENT && biens1.getPrix()>=5000) )
                .collect(Collectors.toList());
        System.out.println(biensAppart);
        System.out.println("");


        // 3. Faire la moyenne du prix de tous les batiments de toutes les villes

        System.out.println("EXERCICE 3");
        System.out.println("---------------------");
        Double prixMoyen = biens.stream()
                .mapToInt(Biens::getPrix).average().getAsDouble();
        System.out.println(prixMoyen);
        System.out.println("");


        // 4. Modifier le prix de toutes les maisons qui ont une surface supérieure à
        // 400 m² en appliquant une taxe de 150% sur le prix

        System.out.println("EXERCICE 4");
        System.out.println("---------------------");
        biens.stream()
                .filter(biens1 -> (biens1.getTypeBiens()==TypeDeBiens.MAISON && biens1.getSurface()>400) )
                .forEach(biens1 -> biens1.setPrix((int) (biens1.getPrix()*1.5)));
        System.out.println(biens);
        System.out.println("");


        // 5. Ne prendre que les villes qui commencent par "C" puis les afficher
        // complètments en MAJUSCULE


        System.out.println("EXERCICE 5");
        System.out.println("---------------------");
        biens.stream()
                .filter(biens1 -> biens1.getLocalite().startsWith("C"))
                .map(Biens::getLocalite).map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("");


        // 6. Trier les batiments pr ordre croissant de prix au m² via
        // prix/surface = ratio. Collecter dans une liste les résultats.
        // Quel est la classe du comparateur utilisé?


        System.out.println("EXERCICE 6");
        System.out.println("---------------------");
        List<Biens> ratioList = biens.stream()
                .sorted(Comparator.comparingInt(o -> o.getPrix() / o.getSurface()))
                .collect(Collectors.toList());
        System.out.println(ratioList);
        System.out.println("");


        // 7. Créer une fonction qui retourne le prix le plus cher pour une ville
        //donnée.

        System.out.println("EXERCICE 7");
        System.out.println("---------------------");
        System.out.println(MaxPrix("Liege",biens)); // MaxPrix est créé hors du main
        System.out.println("");


        // 8. Collecter dans une Map le prix le plus cher de chaque ville.
        // La clé est le nom de la ville, la valeur et le prix

        System.out.println("EXERCICE 8");
        System.out.println("---------------------");

        Map<String,Integer> mapPrix = new HashMap<>();
        biens.stream()
                .map(Biens::getLocalite)
                .distinct()
                .forEach(s -> mapPrix.put(s,MaxPrix(s,biens)));
        System.out.println(mapPrix);


    }

    // Methode utilise pour le .7
    private static Integer MaxPrix(String localite, List<Biens> biens) {
        return biens.stream()
                .filter(biens1 -> biens1.getLocalite().equals(localite))
                .max(Comparator.comparingInt(o -> o.getPrix()))
                .map(Biens::getPrix).get();

    }


}
