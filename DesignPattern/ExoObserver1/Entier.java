package com.company.DesignPattern.ExoObserver1;

import java.util.ArrayList;
import java.util.List;

public class Entier {
    private List<Observer> observers;
    private int nbr;

    public Entier() {
        observers = new ArrayList<Observer>();
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
        this.notifyAllObservers();
    }

    public int getNbr() {
        return nbr;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
