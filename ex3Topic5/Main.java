package ex3Topic5;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        // fill your code here
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the issue date as dd/MM/yyyy");
        Date issueDate = dateFormat.parse(scan.nextLine());
        System.out.println("Enter the due date as dd/MM/yyyy");
        Date dueDate = dateFormat.parse(scan.nextLine());
        System.out.println("Enter the original amount");
        Double originalAmount = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the amount paid so far");
        Double amountOutstanding = Double.parseDouble(scan.nextLine());
        BillHeader billHeader = new BillHeader();
        billHeader.setIssueDate(issueDate);
        billHeader.setDueDate(dueDate);
        billHeader.setOriginalAmount(originalAmount);
        billHeader.setAmountOutstanding(amountOutstanding);
        billHeader.display();
    }
}
