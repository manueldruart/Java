package com.company.Part1.exoTache;

public class Tache {
    private String nom;
    private double montant;


    public Tache(String nom, double montant) {
        this.nom = nom;
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public String getNom() {
        return nom;
    }
}
