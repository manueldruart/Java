package com.company.OpenClassHeritage;

public class Main {
    public static void main(String[] args) {
      Animal a1 = new Animal();
      Animal a2 = new Chien();
      Animal a3 = new Oiseaux();

      a1.deplacer();
      a2.deplacer();
      a3.deplacer();
    }
}
