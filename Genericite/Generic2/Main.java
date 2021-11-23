package com.company.Genericite.Generic2;

public class Main {
    public static void main(String[] args) {
        CompositeKey<String,Integer> a = new CompositeKey<>("test",8);
        CompositeKey<String,Integer> b = new CompositeKey<>("test",8);

        System.out.println(a.equals(b));

    }
}
