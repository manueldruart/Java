package com.company.exoForme;

public class Triangle implements forme{
    private double sideFirst;
    private double sideSecond;
    private double sideThird;
    private double height;


    @Override
    public double perimetre() {
        return sideFirst+sideSecond+sideThird;
    }

    @Override
    public double aire() {
        double base;
        if(sideThird>sideSecond && sideThird>sideFirst){
            base = sideThird;
        }else if(sideSecond>sideThird && sideSecond>sideFirst){
            base = sideSecond;
        }else{
            base = sideFirst;
        }
        return (base*height)/2;
    }
}
