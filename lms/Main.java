package lms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name1 = sc.nextLine();
        System.out.println("Enter username");
        String username1 = sc.nextLine();
        System.out.println("Enter password");
        String password1 = sc.nextLine();
        System.out.println("Enter PhoneNumber");
        long phoneNumber1 = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter name");
        String name2 = sc.nextLine();
        System.out.println("Enter username");
        String username2 = sc.nextLine();
        System.out.println("Enter password");
        String password2 = sc.nextLine();
        System.out.println("Enter PhoneNumber");
        long phoneNumber2 = sc.nextLong();

        exercise user1 = new exercise(name1, username1, password1, phoneNumber1);
        exercise user2 = new exercise(name2, username2, password2, phoneNumber2);

        if( user1.comparePhoneNumber(user2)){
            System.out.println("Same Users");
        } else {
            System.out.println("Different Users");
        }

    }
}
