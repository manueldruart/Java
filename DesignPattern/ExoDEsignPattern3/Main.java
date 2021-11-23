package com.company.DesignPattern.ExoDEsignPattern3;

public class Main {
    public static void main(String[] args) {
        String nbr = "5";
        Validateur validateur = new Validateur(nbr,new EntierStrategy());
        System.out.println(validateur.validate());

        String text ="manu";
        Validateur validateur1 = new Validateur(text,new textStrategy());
        System.out.println(validateur1.validate());

        String mail ="manuel.druart@gmail.com";
        Validateur validateur2 = new Validateur(mail,new mailStrategy());
        System.out.println(validateur2.validate());
    }
}
