package Current;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu\n1.Current Account\n2.Savings Account");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter the account details(name,accountNumber,accountBalance,year)");
            String name = scanner.next();
            String accountNumber = scanner.next();
            double balance = scanner.nextDouble();
            int noOfYears = scanner.nextInt();
            CurrentAccount currentAccount = new CurrentAccount(name, accountNumber, balance);
            double maintenanceCharge = currentAccount.computeMaintainanceCharge(noOfYears);
            System.out.println("Maintenance Charge For Current Account " + maintenanceCharge);
        } else if (choice == 2) {
            System.out.println("Enter the account details(name,accountNumber,accountBalance,year)");
            String name = scanner.next();
            String accountNumber = scanner.next();
            double balance = scanner.nextDouble();
            int noOfYears = scanner.nextInt();
            SavingsAccount savingsAccount = new SavingsAccount(name, accountNumber, balance);
            double maintenanceCharge = savingsAccount.computeMaintainanceCharge(noOfYears);
            System.out.println("Maintenance Charge For Savings Account " + maintenanceCharge);
        } else {
            System.out.println("Invalid input");
        }
    }
}
