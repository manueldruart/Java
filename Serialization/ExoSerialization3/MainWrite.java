package com.company.Serialization.ExoSerialization3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainWrite {
    public static void main(String[] args) {
        String fileName = "personne.dat";
        ObjectOutputStream out = null;

        Personne personne = new Personne("manu","druart","it",280192);
        System.out.println(personne);

        try {
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(personne);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
