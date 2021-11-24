package com.company.ExoSerialization2;

import java.io.*;
import java.util.Scanner;

public class FileName {
    public static void main(String[] args){
        Scanner myFirstObj = new Scanner(System.in);
        System.out.println("Enter fileName");
        String fileName = myFirstObj.nextLine();

        FileWriter fileWriter;
        PrintWriter printWriter =null;
        try {
            printWriter = new PrintWriter(new FileWriter(fileName));
            String string;
            do{
                System.out.println("Enter a String");
                string = myFirstObj.next();
                printWriter.println(string);
            } while(!string.equals("stop"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }

        myFirstObj.close();



    }
}