package com.company.Pendu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionnary {
    List<String> dico = new ArrayList<>();



    public Dictionnary() {
    }

    public List<String> getDico() {
        return dico;
    }

    public void setDico(List<String> dico) {
        this.dico = dico;
    }

    public void loadDico (String path) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            while (true){
                String ligne = br.readLine();
                if (ligne == null) {
                    break;
                }
                dico.add(ligne);
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

    }
}


