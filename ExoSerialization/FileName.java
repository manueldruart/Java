package com.company.ExoSerialization;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileName {
    public static void main(String[] args){
        Scanner myFirstObj = new Scanner(System.in);
        System.out.println("Enter fileName");
        String fileName = myFirstObj.nextLine();

        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            dataOutputStream = new DataOutputStream(fileOutputStream);
            int nbr = 0;
            do{
                System.out.println("Enter a number");
                nbr = myFirstObj.nextInt();
                dataOutputStream.writeInt(nbr);
            } while(nbr!=0);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        myFirstObj.close();



    }
}