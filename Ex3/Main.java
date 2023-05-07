package Ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scan.nextLine();
        System.out.println("Enter the bankname");
        String bname = scan.nextLine();
        System.out.println("Enter the IFSC Code");
        String code = scan.nextLine();
        System.out.println("Enter the aadhar id");
        String id = scan.nextLine();
        System.out.println("Enter the amount");
        Double amount = scan.nextDouble();
        System.out.println("1)Pay using name, bankname and IFSC code");
        System.out.println("2)Pay using aadharid and IFSC code");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the payee account name");
                String name1 = scan.nextLine();
                System.out.println("Enter their bankname");
                String bname1 = scan.nextLine();
                System.out.println("Enter their IFSC Code");
                String code1 = scan.nextLine();
                System.out.println("Enter the amount to deposite");
                Double amount1 = scan.nextDouble();
                System.out.println("Amount deposited successfully");
                System.out.println("Current balance of " + name1 +" account is " + (amount1 + amount));
                break;
            default:
                System.out.println("Invalid value");;
        }
    }

}
