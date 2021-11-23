package com.company.DesignPattern.ExoDesignPattern2;

public class nAllemagne implements AffichageStrategy{
    @Override
    public void afficher(double montant) {
        System.out.println("Der Rechnungsbetrag ist :" + montant);
    }
}
