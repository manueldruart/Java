package com.company.DesignPattern.ExoDesignPattern1;

public class CashStrategy implements PaiementStrategy{
    private int cash;

    public CashStrategy(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public void payer(int montant) {
        System.out.println("L'article " + montant + " a été payé en cash");
    }
}
