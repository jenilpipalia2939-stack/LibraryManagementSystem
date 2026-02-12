package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
//            User user1 =new User();
//            User user2 =new User("Jeni", "9891256254");
//            User user3 =new User(user2);
        Member s1 = new Member(8);
        Member p1 = new Member(9);
        Librarian l1 = new Librarian();
        Member s2 = new Member(2);

        System.out.println(s1.getUserId());
        System.out.println(p1.getUserId());
        System.out.println(l1.getUserId());
        System.out.println(s2.getUserId());

        System.out.println("Total Users: " + User.getTotalUsers());
        }
}
