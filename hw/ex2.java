package hw;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        int number = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println("The " + number + "first of Fibonaci series is: ");
        for (int i = 1; i <= number; ++i) {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
