package com.company.DesignPattern.ExoObserver2;

public class MaxObserver extends Observer{

    public MaxObserver(Station station) {
        this.station = station;
        this.station.attach(this);
    }



    @Override
    public void update() {

        double maxT = Double.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;

        for (double temperature : station.getTemperatures()){
            if (maxT < temperature){
                maxT = temperature;
            }
        }
        System.out.println("La temp Max est de " + maxT);

        for (int humidite : station.getHumidites()) {
            if (maxH < humidite) {
                maxH = humidite;
            }
        }
        System.out.println("Le taux d'humidite max est de " + maxH);
    }
}
