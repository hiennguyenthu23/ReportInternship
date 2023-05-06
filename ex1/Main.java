package ex1;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        // String pattern = "dd-MM-yyyy";
        // DateFormat formatter = new SimpleDateFormat(“dd-MM-yyyy”);
        System.out.println("Enter the name :");
        String name=sc.next();
        System.out.println("Enter Date of Birth :");
        String dateOfBirth=sc.next();
        // Date dateOfBirth = formatter.parse(dateOfBirth);
        System.out.println("Enter Gender :");
        String gender=sc.next();
        System.out.println("Enter Mobile Number :");
        String mobileNumber=sc.next();
        System.out.println("Enter Blood Group :");
        String bloodGroup=sc.next();
        System.out.println("Enter Blood Bank Name :");

        String bloodBankName=sc.next();
        System.out.println("Enter Donor Type :");

        String donorType=sc.next();
        System.out.println("Enter Donation Date :");
        String donationDate=sc.next();
        Donor donor=new Donor();
        donor.setName(name);
        donor.setDateOfBirth(dateOfBirth);
        donor.setGender(gender);
        donor.setMobileNumber(mobileNumber);
        donor.setBloodGroup(bloodGroup);
        donor.setBloodBankName(bloodBankName);
        donor.setDonorType(donorType);
        donor.setDonationDate(donationDate);
        donor.displayDonationDetails();
    }
}
