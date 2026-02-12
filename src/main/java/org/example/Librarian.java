package org.example;

import java.awt.print.Book;

public class Librarian extends User {

    private String employeeNumber;

    public Librarian() {
        super();
    }

    @Override
    void displayDashboard() {
        System.out.println("Librarian Dashboard:");
        System.out.println("Employee No:" + employeeNumber);
    }

    @Override
    boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {};
    void removeBook(Book book) {};
}
