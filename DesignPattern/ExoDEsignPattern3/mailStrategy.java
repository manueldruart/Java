package com.company.DesignPattern.ExoDEsignPattern3;

public class mailStrategy implements ValidatorStrategy{
    @Override
    public boolean valider(String validate) {
        return validate.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._%+-]+\\.[a-zA-Z]{2,6}$");
    }
}
