package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem implements Lendable {
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
            boolean matchesTitle = book.getTitle().equalsIgnoreCase(title);
            boolean matchesAuthor = book.getAuthor().equalsIgnoreCase(author);

            if (matchesTitle || matchesAuthor) {
                searchedResultBook.add(book);
            }
        }
        return searchedResultBook;
    }

    public static List<Book> searchBook(String title, String author, String type) {
        for (Book book : bookInventory) {
            boolean matchesTitle = book.getTitle().equalsIgnoreCase(title);
            boolean matchesAuthor = book.getAuthor().equalsIgnoreCase(author);
//            boolean matchesType =
//                    (type.equals("NovelBook") && book instanceof NovelBook) ||
//                            (type.equals("TextBook") && book instanceof TextBook);
//            Reason for above code commented due to type equal checking condition, Because you are calling method on null object.
//-----------------------------------------------------------------------------------------------------------------------------------------------
            boolean matchesType = ("NovelBook".equals(type) && book instanceof NovelBook) || ("TextBook".equals(type) && book instanceof TextBook);

            if (matchesTitle || matchesAuthor || matchesType) {
                searchedResultBook.add(book);
            }
        }
        return searchedResultBook;
    }

    @Override
    public boolean lend(Book book, User user) {

            if (!book.getIsAvailable()) {
                System.out.println("Book already lent");
                return false;
            }

            if (!user.canBorrowBooks()) {
                System.out.println("User exceeded borrowing limit");
                return false;
            }

            book.setAvailable(false);
            user.incrementBorrowedBook(); // If you have counter

            System.out.println("Book Lent Successfully");
            return true;
    }

    @Override
    public void returnBook(Book book, User user) {
        book.setAvailable(true);
        user.decrementBorrowedBook();
    }
}
