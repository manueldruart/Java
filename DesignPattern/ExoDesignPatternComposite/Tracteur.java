package com.company.DesignPattern.ExoDesignPatternComposite;

public class Tracteur implements Composant{

    private int poids;

    public Tracteur(int poids) {
        this.poids = poids;
    }

    @Override
    public int getPoids() {
        return this.poids;
    }
}
