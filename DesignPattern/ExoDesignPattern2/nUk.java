package com.company.DesignPattern.ExoDesignPattern2;

public class nUk implements AffichageStrategy{
    @Override
    public void afficher(double montant) {
        System.out.println("The amount of the invoice is  :" + montant);
    }
}
