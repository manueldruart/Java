package com.company.Stream.ExerciceLivreElite;

public class Main {

    public static void main(String[] args) {
        Book monLivre = new Book();
        BookElement chapitre1 = new BookElement(ElementType.CHAPITRES,"chap1");
        BookElement chapitre2 = new BookElement(ElementType.CHAPITRES,"chap2");
        BookElement chapitre3 = new BookElement(ElementType.CHAPITRES,"chap3");
        BookElement chapitre4 = new BookElement(ElementType.CHAPITRES,"chap4");
        BookElement chapitre5 = new BookElement(ElementType.CHAPITRES,"chap5");

        BookElement parties1 = new BookElement(ElementType.PARTIES,"part1");
        BookElement parties2 = new BookElement(ElementType.PARTIES,"part2");
        BookElement parties3 = new BookElement(ElementType.PARTIES,"part3");
        BookElement parties4 = new BookElement(ElementType.PARTIES,"part4");
        BookElement parties5 = new BookElement(ElementType.PARTIES,"part5");

        BookElement scenes1 = new BookElement(ElementType.SCENES,"scn1");
        BookElement scenes2 = new BookElement(ElementType.SCENES,"scn2");
        BookElement scenes3 = new BookElement(ElementType.SCENES,"scn3");
        BookElement scenes4 = new BookElement(ElementType.SCENES,"scn4");
        BookElement scenes5 = new BookElement(ElementType.SCENES,"scn5");

        BookElement articles1 = new BookElement(ElementType.ARTICLES,"art1");
        BookElement articles2 = new BookElement(ElementType.ARTICLES,"art2");
        BookElement articles3 = new BookElement(ElementType.ARTICLES,"art3");
        BookElement articles4 = new BookElement(ElementType.ARTICLES,"art4");
        BookElement articles5 = new BookElement(ElementType.ARTICLES,"art5");

        parties1.addChild(chapitre1);
        parties1.addChild(chapitre2);
        chapitre1.addChild(scenes1);
        scenes1.addChild(articles1);
        
        parties2.addChild(chapitre3);
        chapitre3.addChild(scenes2);
        scenes2.addChild(articles2);
        scenes2.addChild(articles3);
        
        parties3.addChild(chapitre4);
        chapitre4.addChild(scenes3);
        scenes3.addChild(articles4);
        
        parties4.addChild(scenes4);
        scenes4.addChild(articles5);
        
        parties5.addChild(chapitre5);
        chapitre5.addChild(scenes5);

        monLivre.add(parties1);
        monLivre.add(parties2);
        monLivre.add(parties3);
        monLivre.add(parties4);
        monLivre.add(parties5);

        monLivre.collect();
    }
}
