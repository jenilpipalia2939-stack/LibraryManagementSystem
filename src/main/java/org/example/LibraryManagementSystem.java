package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory = new ArrayList<>();
    List<User> registeredUsers = new ArrayList<>();

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
}
