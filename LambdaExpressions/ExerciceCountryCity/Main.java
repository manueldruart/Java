package com.company.InterneAnonyme.SortCityCountry;

public class Main {
    public static void main(String[] args) {
        Pays belgique = new Pays("Belgique");
        belgique.addVille(new Ville("Mons"));
        belgique.addVille(new Ville("BX"));
        belgique.addVille(new Ville("Gand"));
        belgique.addVille(new Ville("Liege"));
        belgique.addVille(new Ville("Namur"));
        belgique.addVille(new Ville("Fleron"));
        belgique.addVille(new Ville("Soignies"));
        belgique.addVille(new Ville("Jurbise"));
        belgique.addVille(new Ville("Tubize"));

        System.out.println(belgique.getVilles());
        belgique.sortVilles();
        System.out.println(belgique.getVilles());
    }
}
