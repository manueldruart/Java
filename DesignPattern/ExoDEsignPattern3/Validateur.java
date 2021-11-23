package com.company.DesignPattern.ExoDEsignPattern3;

public class Validateur {
    private String text;
    private ValidatorStrategy strategy;

    public Validateur(String text, ValidatorStrategy strategy) {
        this.text = text;
        this.strategy = strategy;
    }
    public boolean validate()  {
       return this.strategy.valider(text);
    }
}
