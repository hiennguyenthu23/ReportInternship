package hw;

import java.util.Scanner;

public class homework_week1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 4 to jump into the exercise: ");
        int exercise = sc.nextInt();
        switch (exercise) {
            case 1:
                System.out.println("This exercise: to find the given number is perfect or not!!");
                System.out.println("Enter a number: ");
                long num = sc.nextLong();
                long sum = 0;
                int i = 1;
                while (i < num / 2) {
                    if (num % i == 0) {
                        sum = sum + i;
                    }
                    i++;
                }
                if (sum == num) {
                    System.out.println(num + " is a perfect number");
                } else System.out.println(num + " is not a perfect number");
            case 2:
                System.out.println("This exercise: take input of 3 numbers and display lcm and gcd of 3 numbers");
                System.out.println("Enter number for A: ");
                int a = sc.nextInt();
                System.out.println("Enter number for B: ");
                int b = sc.nextInt();
                System.out.println("Enter number for C: ");
                int c = sc.nextInt();
                int gcd = Math.min(a, Math.min(b, c));
                int j;
                for (j = gcd; j >= 1; j--) {
                    if ((a % j == 0) && (b % j == 0) && (c % j == 0))
                        break;
                    System.out.print("GCD of " + a + " " + b + " " + c + " " + " is: " + j + " ");
                    System.out.println();
                }
            case 3:
                System.out.println("This exercise to check number prime or not");
                System.out.println("enter a number: ");
                int prime = sc.nextInt();
                boolean primeCheck = false;
                for (int k = 2; k <= prime / 2; ++k) {
                    if (prime % k == 0) {
                        primeCheck = true;
                        break;
                    }
                }
                if (!primeCheck) {
                    System.out.println(prime + " is a prime number");
                } else System.out.println(prime + " is not a prime number");
            case 4:
                System.out.println("Display even and odd number up to given input number");
                System.out.println("Enter a number please: ");
                int data = sc.nextInt();
                if (data % 2 == 0)
                    System.out.println(data + " is even");
                else System.out.println(data + " is odd");

        }
        System.out.println("The end of program hehe");

    }
}
