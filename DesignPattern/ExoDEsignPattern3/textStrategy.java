package com.company.DesignPattern.ExoDEsignPattern3;

public class textStrategy implements ValidatorStrategy{
    @Override
    public boolean valider(String validate) {
        return validate.matches("^[A-Za-z]*$");
    }
}
