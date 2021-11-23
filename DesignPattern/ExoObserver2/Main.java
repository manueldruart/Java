package com.company.DesignPattern.ExoObserver2;

public class Main {
    public static void main(String[] args) {
        Station station = new Station();

        station.ajouterHumidite(45);
        station.ajouterHumidite(30);
        station.ajouterHumidite(25);

        MaxObserver maxObserver = new MaxObserver(station);
        MoyenneObserver moyenneObserver = new MoyenneObserver(station);

        station.ajouterTemperature(10);
        station.ajouterTemperature(20);
        station.ajouterTemperature(15);


    }
}
