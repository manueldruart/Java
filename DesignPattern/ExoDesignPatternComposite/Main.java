package com.company.DesignPattern.ExoDesignPatternComposite;

public class Main {
    public static void main(String[] args) {

        Tracteur monTracteur = new Tracteur(5);
        System.out.println("Le poids de mon tracteur est de " + monTracteur.getPoids() + " tonne(s)" );

        Remorque maRemorque = new Remorque(1);
        System.out.println("Le poids de ma remorque est de " + maRemorque.getPoids()+ " tonne(s)");

        GroupeElectrogene monGroupeElectrogene = new GroupeElectrogene(2);
        System.out.println("Le poids de mon groupe electrogene est de " + monGroupeElectrogene.getPoids() + " tonne(s)");

        CamionComposite semiRemorque = new CamionComposite();
        semiRemorque.add(monTracteur);
        semiRemorque.add(maRemorque);
        semiRemorque.add(monGroupeElectrogene);
        System.out.println("Le poids de mon semi remorque est de " + semiRemorque.getPoids() + " tonnes");
    }
}
