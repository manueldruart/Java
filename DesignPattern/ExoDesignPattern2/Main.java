package com.company.DesignPattern.ExoDesignPattern2;

public class Main {
    public static void main(String[] args) {
        Facture mafacture = null;
        mafacture = new Facture(50.50);
        mafacture.affiche();
        mafacture.setStrategy(new nAllemagne());
        mafacture.affiche();
        mafacture.setStrategy(new nUk());
        mafacture.affiche();
    }
}
