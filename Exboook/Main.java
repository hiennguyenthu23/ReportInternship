package Exboook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the book details (code, title, author, price): ");
        String details = scanner.nextLine();

        try {
            BookBO bookBO = new BookBO();
            Book book = bookBO.createBook(details);
            System.out.println(book);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

