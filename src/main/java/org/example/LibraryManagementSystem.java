package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    static List<Book> bookInventory = new ArrayList<>();
    static List<User> registeredUsers = new ArrayList<>();
    static List<Book> searchedResultBook = new ArrayList<>();

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public List<Book> getBookInventory() {
        return bookInventory;
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public static List<Book> searchBook(String title, String author) {
        for (Book book : bookInventory) {
            if (book.getTitle().equals(title) || book.getAuthor().equals(author)) {
                searchedResultBook.add(book);
            }
        }
        return searchedResultBook;
    }

    public static List<Book> searchBook(String title, String author, String type) {
        for (Book book : bookInventory) {
            if (book.getTitle().equals(title) || book.getAuthor().equals(author) || BookType.NovelBook.equals(type) || BookType.TextBook.equals(type)) {
                searchedResultBook.add(book);
            }
        }
        return searchedResultBook;
    }
}
