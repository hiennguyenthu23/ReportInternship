package Ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //fill your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Customer details");
        System.out.println("Enter the name");
        String name = scan.nextLine();
        System.out.println("Enter account type");
        String typeAccount = scan.nextLine();

        String dob = "";
        boolean validDOB = false;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/YYYY");
        format.setLenient(false);
        Date date = null;
        while (!validDOB) {
            try {
                System.out.println("Enter date-of-birth");
                dob = scan.nextLine();
                date = format.parse(dob);
                validDOB = true;

            } catch (ParseException e) {
                System.out.println("Wrong Format(eg:01/01/2015)");
            }
        }
        Account ac = new Account(name, typeAccount, date);
        ac.display();
    }
}



