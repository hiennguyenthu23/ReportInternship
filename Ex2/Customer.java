package Ex2;


public class Customer {
    private	String name;
    private	String address;
    private	Integer age;
    private	String mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // fill your code here
    public Customer( String name, String address, Integer age, String mobileNumber) {
        super();
        this.name = name;
        this.address = address;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }
    public Customer() {

    }

    void displayCustomer() {
        //fill your code here
        System.out.println("Bill Details");
        System.out.println("Name " + getName());
        System.out.println("Mobile " + getMobileNumber());
        System.out.println("Age " + getAge());
        System.out.println("Address " + getAddress());
    }
}

