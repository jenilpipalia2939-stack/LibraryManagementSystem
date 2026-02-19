package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoanTracker {
    HashMap<String, List<Book>> userHasBooks = new HashMap<>();

    public void setUserHasBooks(User user, Book book) {
        if (userHasBooks.containsKey(user.getUserId())) {
            userHasBooks.get(user.getUserId()).add(book);
        } else {
            List<Book> newList = new ArrayList<>();
            newList.add(book);
            userHasBooks.put(user.getUserId(), newList);
        }
    }

    public List<Book> getUserHasBooks(User user) {
        if (userHasBooks.containsKey(user.getUserId())) {
           return userHasBooks.get(user.getUserId());
        } else {
           return List.of();
        }
    }
}