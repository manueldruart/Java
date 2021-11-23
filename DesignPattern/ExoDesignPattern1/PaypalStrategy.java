package com.company.DesignPattern.ExoDesignPattern1;

public class PaypalStrategy implements PaiementStrategy{
        private String id;
        private String password;

        @Override
        public void payer(int montant) {
            System.out.println("L'article" + montant + "a été payé par carte de crédit");
        }

}
