package com.company.LambdaExpressions.ExerciceBooleanpairImpair;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int nbr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        nbr = sc.nextInt();
        Function<Integer,Boolean> compare = val1 -> val1%2==0;
        System.out.println(compare.apply(nbr));


    }
}
