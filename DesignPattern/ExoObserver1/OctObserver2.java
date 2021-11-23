package com.company.DesignPattern.ExoObserver1;

public class OctObserver2 extends Observer{

    public OctObserver2(Entier entier){
        this.entier = entier;
        this.entier.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Votre nombre en octal est :" +Integer.toOctalString(entier.getNbr()));

    }
}
