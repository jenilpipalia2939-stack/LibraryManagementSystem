package org.example;

public class NovelBook extends Book {
    private String genre;

    public NovelBook(String isbn, String title, String author, boolean isAvailable, String genre) {
        super(isbn, title, author, isAvailable);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.print("Genre:" + getGenre());
    }
}
