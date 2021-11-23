package com.company.DesignPattern.ExoDesignPattern1;

public class Main {
    public static void main(String[] args) {
        Article iphone = null;
        iphone = new Article("iphone12",800);
        iphone.pay(new CarteDeCreditStrategy("25255252","123","24/02/2023"));
        iphone.pay(new CashStrategy(500));
    }
}
