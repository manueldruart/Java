package com.company.DesignPattern.ExoDesignPattern2;

public class nBelgique implements AffichageStrategy{
    @Override
    public void afficher(double montant) {
        System.out.println("Le montant de la facture est :" + montant);
    }
}
