package com.company.DesignPattern.ExoDesignPattern1;

public class CarteDeCreditStrategy implements PaiementStrategy {
    private String numeroCarte;
    private String cryptogramme;
    private String datexpiration;

    public CarteDeCreditStrategy(String numeroCarte, String cryptogramme, String datexpiration) {
        this.numeroCarte = numeroCarte;
        this.cryptogramme = cryptogramme;
        this.datexpiration = datexpiration;
    }

    @Override
    public void payer(int montant) {
        System.out.println("L'article " + montant + " a été payé avec Paypal");
    }
}
