package com.company.exoForme;

public class Cercle implements forme {

    private double rayon;


    @Override
    public double perimetre() {
        return 2* Math.PI * rayon;
    }

    @Override
    public double aire() {
        return Math.PI * (rayon*rayon);
    }
}
