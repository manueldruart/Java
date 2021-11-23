package com.company.DesignPattern.ExoObserver1;

public class BinObserver3 extends Observer {
    public BinObserver3(Entier entier){
        this.entier = entier;
        this.entier.attach(this);
    }


    @Override
    public void update() {
        System.out.println("Votre nombre en Binaire est :" +Integer.toBinaryString(entier.getNbr()));
    }
}
