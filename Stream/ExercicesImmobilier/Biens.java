package com.company.Stream.ExercicesImmobilier;

import java.util.ArrayList;

public class Biens {
    private int surface;
    private int prix;
    private int distanceGare;
    private TypeDeBiens typeBiens;
    private String localite;

    public Biens(int surface, int prix, int distanceGare, TypeDeBiens typeBiens, String localite) {
        this.surface = surface;
        this.prix = prix;
        this.distanceGare = distanceGare;
        this.typeBiens = typeBiens;
        this.localite = localite;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getDistanceGare() {
        return distanceGare;
    }

    public void setDistanceGare(int distanceGare) {
        this.distanceGare = distanceGare;
    }

    public TypeDeBiens getTypeBiens() {
        return typeBiens;
    }

    public void setTypeBiens(TypeDeBiens typeBiens) {
        this.typeBiens = typeBiens;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    @Override
    public String toString() {
        return "Biens{" +
                "surface=" + surface +
                ", prix=" + prix +
                ", distanceGare=" + distanceGare +
                ", typeBiens=" + typeBiens +
                ", localite='" + localite + '\'' +
                '}' +
                "ratio=" + prix/surface ;
    }
}
