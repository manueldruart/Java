package com.company.InterneAnonyme.SortCityCountry;

public class Ville {
    private String name;

    public Ville(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "name='" + name + '\'' +
                '}';
    }
}
