package com.company.InterneAnonyme.SortCityCountry;

import java.util.*;

public class Pays {
    private String name;
    private List<Ville> villes = new ArrayList<>();

    public Pays(String name) {
        this.name = name;
    }

    public void addVille(Ville ville) {
        this.villes.add(ville);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "name='" + name + '\'' +
                ", villes=" + villes +
                '}';
    }

    public void sortVilles(){
        Collections.sort(this.villes, new Comparator<Ville>() {
            @Override
            public int compare(Ville o1, Ville o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
