package com.company.Pendu;

import java.util.Random;

public class Game {


    Dictionnary dictionnary ;
    String mot;
    String motPendu;
    Random r = new Random();
    int startLife = 10;

    public Game(Dictionnary dictionnary) {
        this.dictionnary = dictionnary;
        dictionnary.loadDico("liste_francais.txt");
        initGame();
        System.out.println(motPendu);
    }

    private void initGame() {
        int randomString = r.nextInt(dictionnary.getDico().size());
        this.mot = dictionnary.getDico().get(randomString);
        for (int i =0 ; i<mot.length();i++){

        }
        this.motPendu = mot.replaceAll("[A-Za-z]","*");
    }

    public void playLetter(String letter) {
        if (letter.length()!=1){
            System.out.println("Veuillez n'entrer qu'une seule lettre");
            return;
        }
        boolean foundLetter = false;
        for (int i = 0; i<motPendu.length()-1;i++){
            if (letter.charAt(0)==mot.charAt(i)){
                char[] chars = motPendu.toCharArray();
                chars[i] = mot.charAt(i);
                motPendu = new String(chars);
                foundLetter = true;
            }
        }
        if (!foundLetter){
            startLife -= 1;
            System.out.println("Vous avez perdu une vie, il vous reste " + startLife);
        }
        System.out.println(motPendu);

        if (mot.equals(motPendu)){
            System.out.println("Vous avez trouvé le mot");
            this.initGame();
        }

        if (startLife==0){
            System.out.println("Le mot a trouvé était " + mot);
            System.out.println("GAME OVER");
        }

    }


    public int getStartLife() {
        return startLife;
    }

    public void setStartLife(int startLife) {
        this.startLife = startLife;
    }
}
