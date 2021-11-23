package com.company.exoForme;

public class Carre implements forme{


    private double side;


    @Override
    public double perimetre() {
        return side*4;
    }

    @Override
    public double aire() {
        return side*side;
    }
}
