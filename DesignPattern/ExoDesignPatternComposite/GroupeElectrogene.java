package com.company.DesignPattern.ExoDesignPatternComposite;

public class GroupeElectrogene implements Composant{
    private int poids;

    public GroupeElectrogene(int poids) {
        this.poids = poids;
    }

    @Override
    public int getPoids() {
        return this.poids;
    }
}
