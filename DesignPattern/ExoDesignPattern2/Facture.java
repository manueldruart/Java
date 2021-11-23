package com.company.DesignPattern.ExoDesignPattern2;

public class Facture {
    private double prix;
    private AffichageStrategy strategy;
    public Facture(double prix) {
        this.prix = prix;
        this.strategy = new nBelgique();
    }

    public void setStrategy(AffichageStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void affiche() {
        strategy.afficher(prix);
    }
}
