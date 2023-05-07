package hw;

import java.util.Scanner;

class condition {
    public static void main(String[] args) {
        // Fill your code here
        float avg;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the subject 1 mark");
        int m1 = scan.nextInt();
        System.out.println("Enter the subject 2 mark");
        int m2 = scan.nextInt();
        System.out.println("Enter the subject 3 mark");
        int m3 = scan.nextInt();
        System.out.println("Enter the subject 4 mark");
        int m4 = scan.nextInt();
        System.out.println("Enter the subject 5 mark");
        int m5 = scan.nextInt();
        if (m1 > 2 && m2 > 2 && m3 > 2 && m4 > 2 && m5 > 2) {
            avg = ( m1 + m2 + m3 + m4 + m5)/5;
            if (avg > 4.0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
    }
}
