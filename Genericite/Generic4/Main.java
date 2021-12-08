package com.company.Genericite.Generic4;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Jungle Book");
        Video video = new Video("MyMovie");
        Newspaper newspaper = new Newspaper("LaDH");
        library.addMedia(book);
        library.addMedia(video);
        library.addMedia(newspaper);

        System.out.println(library.retrieveLast());
    }
}
