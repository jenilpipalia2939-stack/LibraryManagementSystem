package org.example;

public class TextBook extends Book {
    private String subject;
    private String edition;

    public TextBook(String isbn, String title, String author, String subject, String edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    public String getSubject() {
        return subject;
    }

    public String getEdition() {
        return edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Subject: " + getSubject());
        System.out.println("Edition:" + getEdition());
    }
}
