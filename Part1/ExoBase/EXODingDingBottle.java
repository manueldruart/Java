package com.company.ExoBase;

public class EXODingDingBottle {
    public static void main(String args[]){

        for (int i =0; i<100; i++){
            if ( (Integer.toString(i)).endsWith("5") || (i%5==0)) {
                System.out.println("ding-ding");
            }
            if  ( (Integer.toString(i)).endsWith("7") ||  (i%7==0)){
                System.out.println("bottle");
            } else{
                System.out.println(i);
            }

        }




    }
}
