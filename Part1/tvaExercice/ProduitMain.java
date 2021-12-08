package com.company.Part1.tvaExercice;

public class ProduitMain {

    public static void main(String...args){
        Produit produitFirst = new Produit("BE012345", "Ordinateur",540,16);
        Produit produitSecond = new Produit ("BE0789546","Smartphone",540,160,0.12);


        System.out.println(produitFirst);
        produitFirst.addStock();
        System.out.println(produitFirst);
        produitFirst.addStock(10);
        System.out.println(produitFirst);

        produitFirst.reduceStock(1000000);
        System.out.println(produitFirst);

        System.out.println(produitSecond.getFacture(20));
        produitSecond.reduceStock(20);
        System.out.println(produitSecond);

    }
}
