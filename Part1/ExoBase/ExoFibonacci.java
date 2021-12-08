package com.company.Part1.ExoBase;

import java.util.concurrent.ThreadLocalRandom;

public class ExoFibonacci {
    public static void main(String args[]){
        int number = ThreadLocalRandom.current().nextInt(2, 20);
        System.out.println("The number is " + number);
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
