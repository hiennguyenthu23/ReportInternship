package ex8topic5;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // fill your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Address Details :");
        System.out.println("Enter Line 1 :");
        String l1 = scan.nextLine();
        System.out.println("Enter Line 2 :");
        String l2 = scan.nextLine();
        System.out.println("Enter City :");
        String city = scan.nextLine();
        System.out.println("Enter Country :");
        String country = scan.nextLine();
        System.out.println("Enter Zip Code :");
        Integer zipCode = scan.nextInt();
        Address address = new Address(l1, l2,city,country,zipCode);
//        address.setLine1(l1);
//        address.setLine2(l2);
//        address.setCity(city);
//        address.setCountry(country);
//        address.setZipCode(zipCode);
        System.out.println(address.toString());
    }
}
