package org.example;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public Book(Book book) {
        this.isbn = book.getIsbn();
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.isAvailable = book.isAvailable();
    }

    public abstract void displayBookDetails();

    @Override
    public boolean lend(User user) {

        if (!isAvailable) {
            System.out.println("Book already lent");
            return false;
        }

        if (!user.canBorrowBooks()) {
            System.out.println("User exceeded borrowing limit");
            return false;
        }

        System.out.println("Book Lent Successfully");
        isAvailable = false;
        return true;
    }


    @Override
    public void returnBook(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}