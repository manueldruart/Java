package com.company.DesignPattern.ExoDesignPatternComposite2;

public class Magasin implements Benefice{
    private String nom;
    private Double benefice;

    public Magasin(String nom, Double benefice) {
        this.nom = nom;
        this.benefice = benefice;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBenefice(Double benefice) {
        this.benefice = benefice;
    }

    @Override
    public double getBenefice() {
        return benefice;
    }
}
