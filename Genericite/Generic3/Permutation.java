package com.company.Genericite.Generic3;

public class Permutation <E> {
    private E tableau[];

    public Permutation(E[] tableau) {
        this.tableau = tableau;
    }


    public void exchangeElements(E e1, E e2){
        int i;
        int temp = -1;
        int temp2 = -1;
        for (i = 0; i < tableau.length; i++) {
            if (tableau[i].equals(e1)){
                temp = i;
            }else if (tableau[i].equals(e2)){
                temp2 = i;
            }
        }
        if (temp != -1 && temp2 != -1){
            E e3 = tableau[temp];
            tableau[temp] = tableau[temp2];
            tableau[temp2] = e3;

        }
    }
}
