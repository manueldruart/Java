package com.company.DesignPattern.ExoObserver2;

public class MoyenneObserver extends Observer{


    public MoyenneObserver ( Station station) {
        this.station = station;
        this.station.attach(this);
    }

    @Override
    public void update() {

        double moyenneT = 0;
        int moyenneH = 0;
        for (double temperature : station.getTemperatures()) {
            moyenneT += temperature;
        }
        moyenneT /= station.getTemperatures().size();
        System.out.println("La temp moyenne est de " + moyenneT);

        for (int humidite : station.getHumidites()) {
            moyenneH += humidite;
        }
        moyenneH /= station.getHumidites().size();
        System.out.println("Le taux d'humidite moyen est de " + moyenneH);

    }
}
