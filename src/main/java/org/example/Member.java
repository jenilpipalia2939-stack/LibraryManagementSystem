package org.example;

public class Member extends User {

    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT = 5;

    public Member(int borrowedBooksCount) {
        super();
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    void displayDashboard() {
        System.out.println("Member Dashboard:");
        System.out.println("Books Borrowed:" +  borrowedBooksCount);
    }

    @Override
    boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}