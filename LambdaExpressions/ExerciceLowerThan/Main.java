package com.company.LambdaExpressions.ExerciceLowerThan;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        int nbr;
        int nbrSec;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        nbr = sc.nextInt();
        System.out.println("Enter a first number");
        nbrSec = sc.nextInt();
        BiFunction<Integer,Integer,Boolean> compare = (val1, val2 ) -> val1<val2;
        System.out.println(compare.apply(nbr,nbrSec));

    }
}
