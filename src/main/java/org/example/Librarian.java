package org.example;

import java.awt.print.Book;

public class Librarian extends User {

    private String employeeNumber;

    public Librarian(String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String generateEmployeeNumber() {
        return "Employee" + Math.random();
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

    @Override
    public void displayUserDetails() {
        super.displayUserDetails();
    }

    void addNewBook(Book book) {
    }

    void removeBook(Book book) {
    }
}
