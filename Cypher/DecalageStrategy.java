package com.company.Cypher;

public class DecalageStrategy implements CypherStrategy{

    private int offset;


    public DecalageStrategy(int offset) {
        this.offset = offset;
    }

    @Override
    public String chiffrer(String chiffrement) {
        String mot = "";
        for (int i = 0; i<chiffrement.length();i++){
            char c = chiffrement.charAt(i);
            mot += chiffrer(c);
        }
        return mot;
    }

    public char chiffrer(char c) {
        c += offset;
        return c;
    }

    @Override
    public String dechiffrer(String dechiffrement) {
        String mot = "";
        for (int i = 0; i<dechiffrement.length();i++){
            char d = dechiffrement.charAt(i);
            mot += dechiffrer(d);
        }
        return mot;
    }

    public char dechiffrer(char d) {
        d -= offset;
        return d ;
    }
}
