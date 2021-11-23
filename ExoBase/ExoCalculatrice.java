package com.company.ExoBase;

import java.util.Scanner;

public class ExoCalculatrice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = sc.nextInt();
        System.out.println("Enter one of these operators +,-,*,/");
        String operators = sc.next();
        System.out.println("Enter your second number");
        double secondNumber = sc.nextInt();

        double result =0;

        switch(operators) {
            case "+" -> result = number + secondNumber;
            case "-" -> result = number - secondNumber;
            case "*" -> result = number * secondNumber;
            case "/" -> result = number / secondNumber;
        }
        System.out.println(result);





    }
}
