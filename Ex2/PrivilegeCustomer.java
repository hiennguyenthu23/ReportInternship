package Ex2;


public class PrivilegeCustomer extends Customer{

    //fill your code here
    public PrivilegeCustomer(String name, String address, Integer age, String mobileNumber) {
        super(name, address, age, mobileNumber);
    }
    double getBillAmount(Double amount) {
        double discount = 0.3 * amount;
        //fill your code here
        return amount = amount - discount;
    }

}

