package org.example;

public class PrintedBook extends Book {

    public PrintedBook(String isbn, String title, String author, boolean isAvailable) {
        super(isbn, title, author, isAvailable);
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
    }
}
