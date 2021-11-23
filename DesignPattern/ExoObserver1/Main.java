package com.company.DesignPattern.ExoObserver1;

public class Main {
    public static void main(String[] args) {
        Entier entier = new Entier();
        HexObserver1 hexObserver = new HexObserver1(entier);
        BinObserver3 binOberver = new BinObserver3(entier);
        OctObserver2 octObserver = new OctObserver2(entier);
        entier.setNbr(15);
    }
}
