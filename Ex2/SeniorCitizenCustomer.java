package Ex2;


public class SeniorCitizenCustomer extends Customer{

    //fill your code here
    public SeniorCitizenCustomer(String name, String address, Integer age, String mobileNumber) {
        super(name, address, age, mobileNumber);
    }
    double getBillAmount(Double amount) {
        double discount = 0.12 * amount;
        //fill your code here
        return amount = amount - discount;
    }

}
