package com.company.ExoSerialization3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class MainRead {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fileName you want to open");
        String fileName = scanner.nextLine();
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream(fileName));
            System.out.println(in.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
