package com.company.ExoBase;
import java.util.concurrent.ThreadLocalRandom;
public class Main {

    public static void main(String[] args) {
//        Point point, secondPoint;
//        point = new Point();
//        secondPoint = new Point(6, 20);
//        System.out.println("X = " + point.getX());
//        System.out.println("Y = " + point.getY());
//        System.out.println(secondPoint);
//
//
//        int a = 5;
//        int b = 10;
//        a += b;
//        System.out.println(a);



                                // Utilisation du IF ELSE comme pour du JS //
//        int valA = 5;
//        int valB = 6;
//
//        if (valA>valB){
//            System.out.println("valA > valB");
//        } else {
//            System.out.println("NOT valA > valB");
//        }

//        valA > valB ? System.out.println("valA > valB")
//                    : System.out.println("Not valA > valB");


// EX 4.3 commutation
    // a =1; b=5; ===> a=5; b=1;

//    int a = 1;
//    int b = 5;
//
//    int tmp = a;
//    a = b ;
//    b = tmp;
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);
//
//                                                    // EX 4.4
//
//        int i, j;
//        double x = 2.0, y = 3.0;
//        i= 100/6;
//        j= 100%6;
//        System.out.println(i);
//        System.out.println(j);
//        i= 5%8;
//        System.out.println(i);
//        System.out.println((3*i-2*j)/(2*x-y)); // int / double  = double
//
//        String color ="blue";
//        switch (color) {
//            case "blue" :
//                System.out.println("That's blue color");
//                break;
//            case "red" :
//                System.out.println("That's red color");
//                break;
//            default:
//                System.out.println("That's default color");
//        }

    // EX 6. Instruction de branchement et de contrôle



//        double a = Math.random();
//        System.out.println("The number is " + a);
//        if (a < 0.2) {
//            System.out.println("Between 0 & 0.2");
//        } else if (a < 0.4) {
//            System.out.println("Between 0.2 & 0.4");
//        } else if (a < 0.6) {
//            System.out.println("Between 0.4 & 0.6");
//        }else if (a < 0.8) {
//            System.out.println("Between 0.6 & 0.");
//        }else  {
//            System.out.println("Between 0.8 & 1");
//        }

//        int x = ThreadLocalRandom.current().nextInt(40,100);
//        System.out.println(x);
//        if (x % 2 == 0 || x % 3 == 0 || x % 5 ==0) {
//            System.out.println("Ce nombre est divisible par 2, 3 ou 5");
//        } else {
//            System.out.println("Ce nombre n'est pas divisible par 2, 3 et 5");
//        }

        int res = ThreadLocalRandom.current().nextInt(40,100);
        String note;
        String detail;
        boolean isPlus, isMinus;
        System.out.println(res);
        if (res < 60 ){
            note = "F";
        } else if (res < 70 ){
            note = "D";
        }else if (res < 80 ){
            note = "C";
        }else if (res < 90 ){
            note = "B";
        } else {
            note = "A";
        }

        String symbole = "" ;
         String convertedNumber = Integer.toString(res);
        if (convertedNumber.endsWith("8") || convertedNumber.endsWith("9")){
            symbole = "+";
        } else if (convertedNumber.endsWith("0") || convertedNumber.endsWith("1")){
            symbole = "-";
        }

        System.out.println(note + symbole);

    }
}

