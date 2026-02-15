package org.example;

import static org.example.LibraryManagementSystem.searchBook;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
//            User user1 =new User();
//            User user2 =new User("Jeni", "9891256254");
//            User user3 =new User(user2);
        Member s1 = new Member("Jeni", "99267 98844", 4 );
        Member p1 = new Member("Kartik","99267 98845", 3);
        Librarian l1 = new Librarian("Bapu", "45821 26551");
        Member s2 = new Member("Jack", "99268 54845", 2);

        System.out.println(s1.getUserId());
        System.out.println(p1.getUserId());
        System.out.println(l1.getUserId());
        System.out.println(s2.getUserId());
        System.out.println("Total Users: " + User.getTotalUsers());

        LibraryManagementSystem library1 = new LibraryManagementSystem();
        library1.registerUser(s1);
        library1.registerUser(p1);
        library1.registerUser(l1);
        library1.registerUser(s2);

        library1.addBook(new PrintedBook("145635", "Morae Mooro", "Devayat Khavad"));
        library1.addBook(new PrintedBook("111001", "Rich Dad Poor Dad", "Robert Kiyosaki"));
        library1.addBook(new PrintedBook("111002", "Atomic Habits", "James Clear"));

        library1.addBook(new TextBook(
                "222001",
                "Data Structures Using Java",
                "Mark Allen Weiss",
                "Computer Science",
                "3"
        ));

        library1.addBook(new TextBook(
                "222002",
                "Engineering Mathematics",
                "B.S. Grewal",
                "Mathematics",
                "5"
        ));

        library1.addBook(new NovelBook(
                "333001",
                "The Alchemist",
                "Paulo Coelho",
                "Fiction"
        ));

        library1.addBook(new NovelBook(
                "333002",
                "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling",
                "Fantasy"
        ));

        for (Book b : library1.getBookInventory()) {
            b.displayBookDetails();
        }

        for (User u : library1.getRegisteredUsers()) {
            u.displayUserDetails();
        }

        System.out.println(searchBook("Rich Dad Poor Dad", "Robert Kiyosaki", "NovelBook"));
    }
}