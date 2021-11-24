package com.company.ExoJour;

public class Jour {
    private int num;
    private final static String code ="DILUMAMEJEVESA";
    private final static String[] days = {"dimanche","lundi","mardi","mercredi","jeudi","vendredi","samedi"};

    public Jour() {
        num = 0;
    }

    public Jour(String chaine){
        chaine = chaine.charAt(0) + "" + chaine.charAt(1);
        String abrev;
        for (int i = 0 ; i < (code.length()/2); i++){
            abrev = code.charAt(2 * i) + "" + code.charAt((2 * i)+1);
            if (chaine.equalsIgnoreCase(abrev)){
                num = i;
                break;
            }
        }
    }


    public void nextDay(){
        if (num != 6){
            num++;
        }else {
            num = 0;
        }
    }

    public Jour getpreviousDay(){

        return num !=0 ? new Jour(days[num - 1]) : new Jour(days[6]);
    }

    public int getNum(){
        return num;
    }

    @Override
    public String toString() {
        return days [num] ;
    }
}
