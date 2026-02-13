package org.example;

public abstract class Book implements Lendable {
    private final String isbn;
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author) {
        super();
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public abstract void displayBookDetails();

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
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
