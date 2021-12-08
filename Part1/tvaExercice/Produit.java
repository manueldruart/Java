package com.company.Part1.tvaExercice;

public class Produit {
    private String reference;
    private String libelle;
    private int quantite;
    private double prixUnitaire;
    private double tva;


    public Produit(String reference, String libelle, int quantite, double prixUnitaire, double tva) {
        this.reference = reference;
        this.libelle = libelle;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.tva = tva;
    }


    public Produit(String reference, String libelle, int quantite, double prixUnitaire) {
        this(reference, libelle, quantite, prixUnitaire, 0.21);
    }

    public double getFacture(int orderedQuantity){
        double prix = orderedQuantity * prixUnitaire;
        prix -= this.getReduction(prix, orderedQuantity);
        return prix * (1 + tva);
    }

    public double getReduction(double montant, int orderedQuantity) {
        return orderedQuantity > 100 ? (montant * 0.05) : 0;
    }

    public void addStock(){
        quantite++;
    }

    public void addStock(int quantite){
        this.quantite += quantite;
    }

    public void reduceStock(){
        if (quantite > 0){
        quantite--;}else {
            System.out.println("ERROR NOT THE QUANTITY");
        }
    }

    public void reduceStock(int quantite) {
        if (quantite > this.quantite) {
            System.out.println("ERROR NOT THE QUANTITY");
        } else {
            this.quantite -= quantite;
        }
    }
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "reference='" + reference + '\'' +
                ", libelle='" + libelle + '\'' +
                ", quantite=" + quantite +
                ", prixUnitaire=" + prixUnitaire +
                ", tva=" + tva +
                '}';
    }
}
