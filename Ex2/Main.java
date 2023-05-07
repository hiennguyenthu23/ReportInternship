package Ex2;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //fill your code here
        DecimalFormat dc = new DecimalFormat("0.0");
        DecimalFormat dc2 = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("1)Privilege Customer");
        System.out.println("2)SeniorCitizen Customer");
        System.out.println("Enter Customer Type");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter The Name");
                String name = scan.next();
                System.out.println("Enter The Age");
                int age = scan.nextInt();
                System.out.println("Enter The Address");
                String address = scan.next();
                System.out.println("Enter The Mobile Number");
                String mobileNum = scan.next();
                System.out.println("Enter The Purchased Amount");
                double amount = scan.nextDouble();
                PrivilegeCustomer pc = new PrivilegeCustomer(name, address, age, mobileNum);

                pc.displayCustomer();
                System.out.println("Your bill amount is Rs "
                        + dc2.format(amount) + ". Your bill amount is discount under privilege customer\n" +
                        "You have to pay Rs " + dc2.format(pc.getBillAmount(amount))) ;
            break;
                case 2:
                System.out.println("Enter The Name");
                String name1 = scan.next();
                System.out.println("Enter The Age");
                int age1 = scan.nextInt();
                System.out.println("Enter The Address");
                String address1 = scan.next();
                System.out.println("Enter The Mobile Number");
                String mobileNum1 = scan.next();
                System.out.println("Enter The Purchased Amount");
                double amount1 = scan.nextDouble();
                SeniorCitizenCustomer sc = new SeniorCitizenCustomer(name1, address1, age1, mobileNum1);
                sc.displayCustomer();
                System.out.println("Your bill amount is Rs "
                        + dc2.format(amount1) + ". Your bill amount is discount under senior citizen customer\n" +
                        "You have to pay Rs " + dc2.format(sc.getBillAmount(amount1))) ;
            break;
                default:
                System.out.println("Invalid Customer Type");
        }


    }

}

