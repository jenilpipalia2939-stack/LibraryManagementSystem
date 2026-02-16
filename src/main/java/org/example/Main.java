package org.example;

import static org.example.LibraryManagementSystem.searchBook;

public class Main {

    public static void main(String[] args) {

        // Step 3.2: Create instances of Member and Librarian
        Member s1 = new Member("Jeni", "99267 98844", 4);
        Member p1 = new Member("Kartik", "99267 98845", 3);
        Librarian l1 = new Librarian("Bapu", "45821 26551");
        Member s2 = new Member("Jack", "99268 54845", 2);

        // Display generated IDs
        System.out.println(s1.getUserId());
        System.out.println(p1.getUserId());
        System.out.println(l1.getUserId());
        System.out.println(s2.getUserId());
        System.out.println("Total Users: " + User.getTotalUsers());

        // Create Library System
        LibraryManagementSystem library1 = new LibraryManagementSystem();

        // Step 3.2: Register Users
        library1.registerUser(s1);
        library1.registerUser(p1);
        library1.registerUser(l1);
        library1.registerUser(s2);

        // Step 3.1: Create TextBook and NovelBook Objects

        Book dsBook = new TextBook("222001", "Data Structures Using Java", "Mark Allen Weiss", "Computer Science", true, "3");

        Book mathBook = new TextBook("222002", "Engineering Mathematics", "B.S. Grewal", "Mathematics", true, "5");

        Book alchemist = new NovelBook("333001", "The Alchemist", "Paulo Coelho", true, "Fiction");

        Book harryPotter = new NovelBook("333002", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", true, "Fantasy");


        // Step 3.1: Add Books To Library
        library1.addBook(dsBook);
        library1.addBook(mathBook);
        library1.addBook(alchemist);
        library1.addBook(harryPotter);


        // Step 3.3: Print All Books
        System.out.println("\n===== BOOK INVENTORY =====");
        for (Book b : library1.getBookInventory()) {
            b.displayBookDetails();
            System.out.println("----------------------");
        }

        // Step 3.3: Print All Users
        System.out.println("\n===== REGISTERED USERS =====");
        for (User u : library1.getRegisteredUsers()) {
            u.displayUserDetails();
            System.out.println("----------------------");
        }

        // Search Example
        System.out.println("\n===== SEARCH RESULT =====");
        System.out.println(searchBook("Rich Dad Poor Dad", "Robert Kiyosaki", "PrintedBook"));
        boolean isLent;
         isLent = library1.lend(s1);
         isLent = mathBook.lend(s2);
         isLent = alchemist.lend(s1);
         isLent = harryPotter.lend(p1);



    }
}
