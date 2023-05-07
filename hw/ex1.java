package hw;

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 6: ");
        int day = sc.nextInt();

//        switch (day) {
//            case 1:
//                System.out.println("Today is Monday");
//                break;
//            case 2:
//                System.out.println("Today is Tuesday");
//                break;
//            case 3:
//                System.out.println("Today is Wednesday");
//                break;
//            case 4:
//                System.out.println("Today is Thursday");
//                break;
//            case 5:
//                System.out.println("Today is Friday");
//                break;
//            case 6:
//                System.out.println("Today is Saturday");
//                break;
//            case 7:
//                System.out.println("Today is Sunday");
//                break;

        for (int i = 1; i <= day; i++) {
            System.out.println("Do you want to continue? Y/N");
            String c = sc.next();
            if (c == "Y" || c == "yes"){
                if ( i == 1) {
                    System.out.println("MOnday");
                    continue;
                }
            } else {
                break;
            }
        }
    }
}
