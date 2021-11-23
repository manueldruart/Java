package com.company.DesignPattern.ExoDEsignPattern3;

public class EntierStrategy implements ValidatorStrategy {


    @Override
    public boolean valider(String validate) {
        return validate.matches("^[0-9]*$");
    }
}
