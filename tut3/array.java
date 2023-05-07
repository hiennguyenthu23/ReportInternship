package tut3;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first matrix");

        int arr[][] = new int[3][3];

//writing values into 2 dim. array
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                arr[i][j] = sc.nextInt();

            }

        }

//reading values from 2 dim. array
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();


        }
    }
}
