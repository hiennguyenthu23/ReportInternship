package ex3topic8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user detail in CSV format");
        String details = sc.nextLine();
        String[] arr = details.split(",");
        //Long id = Long.parseLong(arr[0]);
        String name = arr[0];
        String contact = arr[1];
        String username = arr[2];
        String password = arr[3];
        User user = new User(name ,contact, username, password);
        UserDAO userDao = new UserDAO();
        List<User> userList = new ArrayList<>();
        userDao.insertDetails(user);
        userList = userDao.getAllUser();
        System.out.format("%-5s %-10s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
        for (User user2 : userList) {
            Long id2 = user2.getId();
            String name2 = user2.getName();
            String contact2 = user2.getContactDetail();
            String username2 = user2.getUsername();
            String password2 = user2.getPassword();
            System.out.format("%-5s %-10s %-15s %-10s %s\n", id2, name2, contact2, username2, password2);

        }

    }
}
