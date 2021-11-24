package com.company.ExoSerialization2;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fileName you want to open");
        String fileName = scanner.nextLine();
        BufferedReader br = null;
        Scanner scan = null;
        try {
            scan = new Scanner(new FileReader(fileName));
            while (scan.hasNext()){
                String ligne = scan.nextLine();
                    System.out.println(ligne);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            scan.close();
        }

        try {
            br = new BufferedReader(new FileReader(fileName));
            while (true){
                String ligne = br.readLine();
                if (ligne == null) {
                    break;
                }
                System.out.println(ligne);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
