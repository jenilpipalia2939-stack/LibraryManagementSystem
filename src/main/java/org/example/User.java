package org.example;

import javax.print.attribute.UnmodifiableSetException;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;
    protected int borrowedBooksCount;


    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
        this.userId = generateUniqueId();
    }

    public final String generateUniqueId() {
        return "USER" + totalUsers;
    }

//
//    public User(User user) {
//        this.name = user.getName();
//        this.contactInfo = user.getContactInfo();
//    }

    public void incrementBorrowedBook() {
        this.borrowedBooksCount++;
    }

    public void decrementBorrowedBook() {
        this.borrowedBooksCount--;
    }

    abstract void displayDashboard();

    abstract boolean canBorrowBooks();

    public void setName(String userName) {
        this.name = userName;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return this.name;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public String getUserId() {
        return userId;
    }

    public void displayUserDetails() {
        System.out.println("User ID: " + getUserId());
        System.out.println("Name: " + getName());
        System.out.println("contact Info: " + getContactInfo());
    }
}
