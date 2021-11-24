package com.company.ExoBase;

import java.util.Arrays;
import java.util.Scanner;

public class ExoTableau1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the table");
        int tablesize = sc.nextInt();
        String[] stringTable = new String[tablesize];
        for(int i =0; i < stringTable.length; i++){
            System.out.println("Enter a value" + i + "from the table");
            stringTable[i] = sc.next();

        }
        System.out.println(Arrays.toString(stringTable));
    }
}
