package org.example;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

//    public User(String name, String contactInfo) {
//        this.name = name;
//        this.contactInfo = contactInfo;
//    }

    public final String generateUniqueId() {
        return "USER" + totalUsers;
    }

    public User() {
        totalUsers++;
        this.userId = generateUniqueId();
    }

//
//    public User(User user) {
//        this.name = user.getName();
//        this.contactInfo = user.getContactInfo();
//    }

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
}
