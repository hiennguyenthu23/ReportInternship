package hw;

import java.util.Scanner;

class triangle {
    public static void main(String[] args) throws Exception{

//		Fill your code
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of steps to be print: ");
        int step = scan.nextInt();

        for (int i = 1; i <= step; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

