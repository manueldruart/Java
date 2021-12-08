package com.company.Cypher;

public class DicoStrategy implements CypherStrategy {
    String origin = "abcdefghijklmnopqurstuvxyz123456789";
    String dest = "123456789abcdefghijklmnopqurstuvxyz";

    public DicoStrategy(String origin, String dest) {
        this.origin = origin;
        this.dest = dest;
    }

    @Override
    public String chiffrer(String chiffrement) {
        String mot = "";
        for (int i = 0; i < chiffrement.length(); i++) {
            char c = chiffrement.charAt(i);
            mot += chiffrer(c);
        }
        return mot;
    }

    public char chiffrer(char c) {
        int i = this.origin.indexOf(c);
        if (i >= 0) {
            return this.dest.charAt(i);
        }
        return c;
    }

    @Override
    public String dechiffrer(String dechiffrement) {
        String mot = "";
        for (int i = 0; i < dechiffrement.length(); i++) {
            char c = dechiffrement.charAt(i);
            mot += dechiffrer(c);
        }
        return mot;
    }

    public char dechiffrer(char c) {
        int i = this.dest.indexOf(c);
        if (i >= 0) {
            return this.origin.charAt(i);
        }
        return c;
    }
}