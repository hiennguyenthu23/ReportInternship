package hw;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //Fill your code
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scan.nextInt();
        // while (n < 0) ;
        int array1[] = new int[n];
        String array[] = new String[n];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            array1[i] = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Enter strings: ");
        for (int j = 0; j < n; j++) {
            array[j] = scan.nextLine();
        }
        System.out.println("Displaying numbers");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + "\n");
        }
        System.out.println("Displaying strings");
        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + "\n");
        }
    }
}
