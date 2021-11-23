package com.company.DesignPattern.ExoObserver1;

public class HexObserver1 extends Observer{


    public HexObserver1(Entier entier){
        this.entier = entier;
        this.entier.attach(this);
    }


    @Override
    public void update() {
        System.out.println("Votre nombre en Hexadécimal est :" + Integer.toHexString(entier.getNbr()));
    }
}
