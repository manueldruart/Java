package com.company.DesignPattern.ExoDesignPatternComposite2;

public class Main {
    public static void main(String[] args) {
        Pays belgique = new Pays();
        Province hainaut = new Province();
        Province bw = new Province();
        Province liege = new Province();
        Ville mons = new Ville();
        Ville tubize = new Ville();
        Ville waterloo = new Ville();
        Ville soignies = new Ville();
        Ville verviers = new Ville();
        Ville fleron = new Ville();
        Magasin a = new Magasin("Mons",12500.5);
        Magasin b = new Magasin("Tubize",10000.0);
        Magasin c = new Magasin("Waterloo", 20000.0);
        Magasin d = new Magasin("Soignies", 6000.6);
        Magasin e = new Magasin("Verviers", 14000.0);
        Magasin f = new Magasin("Fleron", 8500.0);
        belgique.add(hainaut);
        belgique.add(bw);
        belgique.add(liege);
        hainaut.add(mons);
        hainaut.add(soignies);
        bw.add(tubize);
        bw.add(waterloo);
        liege.add(verviers);
        liege.add(fleron);
        mons.add(a);
        tubize.add(b);
        waterloo.add(c);
        soignies.add(d);
        verviers.add(e);
        fleron.add(f);

        System.out.println("Le chiffre d'affaire pour la Belgique est de " + belgique.getBenefice() + " euro");
        System.out.println("Le chiffre d'affaire pour le Hainaut est de " + hainaut.getBenefice() + " euro");
        System.out.println("Le chiffre d'affaire pour le BW est de " + bw.getBenefice() + " euro");
        System.out.println("Le chiffre d'affaire pour Liege est de " + liege.getBenefice() + " euro");
    }


}
