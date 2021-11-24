package com.company.Velo;

public class Velo {
    String marque;
    int vitesse;
    String couleur;
    int poids;



    //---------------------Constructor--------------------------------//
    public Velo(String marque, int vitesse, String couleur, int poids) {
        this.marque = marque;
        this.vitesse = vitesse;
        this.couleur = couleur;
        this.poids = poids;
    }

    public void accelerer() {
        vitesse = vitesse + 10;
    }
    public void freiner(){
        vitesse = vitesse -10;
    }
}
