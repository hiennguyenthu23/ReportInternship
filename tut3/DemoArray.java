package tut3;

import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        //int arr1[] = {1, 2, 3, 40, 45, 45,32,46,23,13};
//        System.out.println(arr1[4]);
        System.out.println("enter elements of the array: ");
        for (int i = 0; i < 10; i++) {
            arr1[i] = sn.nextInt();
        }

        System.out.println("enter elements of the array: ");
        for (int i = 0; i < 10; i++) {
            arr2[i] = sn.nextInt();
        }
        System.out.println("elemts of array 1");
        for (int i = 0; i <10; i++) {
            System.out.println(arr1[i] + "\t");
        }
        System.out.println("elemts of array 2");
        for (int i = 0; i <10; i++) {
            System.out.println(arr2[i] + "\t");
        }
        int arrSum[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arrSum[i] = arr1[i] + arr2[i];
        }
        System.out.println();
        System.out.println("Sum of 2 arrays: ");
        for (int i = 0; i < 10 ; i ++) {
            System.out.println(arrSum[i] + "\t");
        }

    }
}
