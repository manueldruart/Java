package com.company.Part1.InteretExercice;

public class Placement {
    private double interet;
    private double capital;


    public Placement(double interet, double capital) {
        this.interet = interet;
        this.capital = capital;
    }

    public Placement(double interet) {
        this.interet = interet;
    }

    public Placement(){

    }

    public double total(int years){
        return capital * Math.pow(1+(interet / 100),years);
    }
}
