package com.company.Stream.ExerciceLivreElite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookElement {
    private ElementType elementType;
    private List<BookElement> bookElements = new ArrayList<>();
    private String title;


    // methode pour ajouter les enfants
    public void addChild(BookElement element) {
        this.bookElements.add(element);
    }
    // methode pour retourner tous les enfants de la liste
    public List<BookElement> returnAllChildren() {
        return  Stream.concat(bookElements.stream(),
                bookElements.stream()
                        .flatMap(bookElement -> bookElement.returnAllChildren().stream()))
                .collect(Collectors.toList());
    }


    public BookElement(ElementType elementType, List<BookElement> bookElements, String title) {
        this.elementType = elementType;
        this.bookElements = bookElements;
        this.title = title;
    }

    public BookElement(ElementType elementType, String title) {
        this.elementType = elementType;
        this.title =title;
    }

    @Override
    public String toString() {
        return "BookElement{" +
                "elementType=" + elementType +
                ", title='" + title + '\'' +
                '}';
    }
}
