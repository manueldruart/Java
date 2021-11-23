package com.company.Genericite.Generic3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] tab = {"a","b","c","d"};
        System.out.println(Arrays.deepToString(tab));
        Permutation<String> a = new Permutation<>(tab);
        a.exchangeElements(tab[2],tab[0]);
        System.out.println(Arrays.deepToString(tab));
    }
}
