package Ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //fill your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks");
        int score = scan.nextInt();
            if (score == 100) {
                System.out.println("The student  obtained a S grade");
            } else if (score >= 90 && score < 100) {
                System.out.println("The student obtained a A grade");
            } else if (score >= 80  && score < 90) {
                System.out.println("The student obtained a B grade");
            } else if (score >= 70 && score < 80) {
                System.out.println("The student obtained a C grade");
            } else if (score >= 60 && score < 70) {
                System.out.println("The student obtained a D grade");
            } else if (score >= 50 && score < 60) {
                System.out.println("The student obtained a E grade");
            } else if (score < 50) {
                System.out.println("The student obtained a F grade");
            } else {
                System.out.println("Invalid Input");
            }

        }

    }

