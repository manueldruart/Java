package com.company.Stream.ExerciceLivreElite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Book {
    private static Object BookElement;
    private List<BookElement> bookElements = new ArrayList<>();

       void add(BookElement bookElement) {
            this.bookElements.add(bookElement);
        }

        void collect() {
            Stream.concat(bookElements.stream(),bookElements.stream().flatMap(bookElement -> bookElement.returnAllChildren().stream())).collect(Collectors.toList())
                    .forEach(System.out::println);
        }
}
