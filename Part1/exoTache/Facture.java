package com.company.Part1.exoTache;

import java.util.Arrays;
import java.util.Objects;

public class Facture {

    private static int count = 0;


    private String numFacture;
    private String numTva;
    private double tauxTva;
    private Tache[] taches;
    private double ristourne;

    private int tacheCount = 0;


    public Facture(String numFacture, String numTva, double tauxTva, Tache[] taches, double ristourne) {
        this.numFacture = numFacture;
        this.numTva = numTva;
        this.tauxTva = tauxTva;
        this.taches = taches;
        this.ristourne = ristourne;
        count++;
    }

    public void addRistourne(double addAmount) {
        ristourne += addAmount;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < taches.length; i++) {
            total += taches[i].getMontant();
        }
        for (Tache tache : taches) {
            total += tache.getMontant();
        }
        total -= ristourne;
        total *= (1 + tauxTva);
        return total;
    }

    public Tache getTache(int index) {
        if (index < 0 || index > taches.length) {
            System.out.println("Invalid index");
            return null;
        } else {
            return taches[index];
        }
    }

    public void addTache(Tache tache) {
        boolean isInclude = false;
        for (Tache includeTache : taches) {
            if (tache.getNom().equals(includeTache.getNom())) {
                isInclude = true;
                break;
            }
        }
        if(!isInclude){
            if (taches.length < 4){
                taches[tacheCount] = tache;
                tacheCount++;
            } else {
                System.out.println("NOMBRE DE TACHE MAX ATTEINT");
            }
        }
    }


    public int getTacheCount() {
        return tacheCount;
    }

    public void supprimerTache(Tache tache){
        int index = 0;
        for (Tache includeTache: taches){
            if (tache.equals(includeTache)){
               break;
            }
            index++;
        }
        for (int i = index ; i < (taches.length - 2); i++){
            taches[i] = taches [ i + 1];
        }
    }

    public static int getCount() {
        return count;
    }


    public Facture clone(){
        return new Facture(
                this.numFacture,
                this.numTva,
                this.tauxTva,
                this.taches,
                this.ristourne
        );
    }

    @Override
    public String toString() {
        return "Facture{" +
                "numFacture='" + numFacture + '\'' +
                ", numTva='" + numTva + '\'' +
                ", tauxTva=" + tauxTva +
                ", taches=" + Arrays.toString(taches) +
                ", ristourne=" + ristourne +
                ", tacheCount=" + tacheCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facture facture = (Facture) o;
        return Double.compare(facture.tauxTva, tauxTva) == 0 && Double.compare(facture.ristourne, ristourne) == 0 && tacheCount == facture.tacheCount && Objects.equals(numFacture, facture.numFacture) && Objects.equals(numTva, facture.numTva) && Arrays.equals(taches, facture.taches);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numFacture, numTva, tauxTva, ristourne, tacheCount);
        result = 31 * result + Arrays.hashCode(taches);
        return result;
    }
}

