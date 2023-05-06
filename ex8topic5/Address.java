package ex8topic5;

// fill your code here

public class Address {
    private String line1;
    private String line2;
    private String city;
    private String country;
    private int zipCode;

    public Address() {
    super();
    }

    // fill your code here

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public Address(String line1, String line2, String city, String country, Integer zipCode){
        super();
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return "Address Details :\n" + new StringBuilder().append(this.getLine1()) + ",\n" + new
                StringBuilder().append(this.getLine2()) + ",\n"
                + new StringBuilder().append(this.getCity()) + " - " + new
                StringBuilder().append(this.getZipCode()) + "\n"
                + new StringBuilder().append(this.getCountry());
    }
}
