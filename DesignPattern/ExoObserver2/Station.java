package com.company.DesignPattern.ExoObserver2;

import java.util.ArrayList;
import java.util.List;

public class Station {

    private List<Observer> observers;
    private List<Double> temperatures;
    private List<Integer> humidites;


    public List<Observer> getObservers() {
        return observers;
    }

    public List<Double> getTemperatures() {
        return temperatures;
    }

    public List<Integer> getHumidites() {
        return humidites;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void setTemperatures(List<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void setHumidites(List<Integer> humidites) {
        this.humidites = humidites;
    }

    public Station() {
        observers = new ArrayList<Observer>();
        temperatures = new ArrayList<Double>();
        humidites = new ArrayList<Integer>();
    }

    public void ajouterTemperature(double temperature) {
        temperatures.add(temperature);
        notifyAllobservers();
    }

    public void ajouterHumidite(int humidite) {
        humidites.add(humidite);
        notifyAllobservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllobservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
