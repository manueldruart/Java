package com.company.Pendu;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dictionnary dictionnary = new Dictionnary();
        Game game = new Game(dictionnary);
        Scanner sc = new Scanner(System.in);
        int startLife = game.getStartLife();

        while (startLife>0){

            String letter = sc.nextLine();
            game.playLetter(letter);
        }

    }
}
