package Ex4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    String accountName;
    String accountType;
    private Date dob;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Account() {
        // TODO Auto-generated constructor stub
    }

    public Account(String accountName, String accountType, Date dob) {
        super();
        this.accountName = accountName;
        this.accountType = accountType;
        this.dob = dob;
    }


    void display(){
        // fill your code here
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Account Details");
        System.out.println("Name : " + accountName);
        System.out.println("Type : " + accountType);
        System.out.println("D.O.B : " + df.format(dob));
    }

    public boolean validateDOB(String dob) {
        // fill your code here
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        df.setLenient(false);
        try {
            Date date = df.parse(dob);
            Date now = new Date();
            if (date.after(now)) {
                return false;
            }
            setDob(date);
            return true;
        } catch (ParseException e) {
            System.out.println("Wrong Format(eg:01/01/2015)");
            System.out.println("Enter date-of-birth");
            return false;
        }
    }
}

