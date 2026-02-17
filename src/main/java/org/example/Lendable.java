package org.example;

public interface Lendable {
    boolean lend(Book book, User user);

    void returnBook(Book book, User user);
}
