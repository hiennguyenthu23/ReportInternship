package Ex3;

public class Doctor {
    private String name;
    private String email;
    private String mobileNumber;
    private String qualification;
    private int experience;

    public Doctor() {

    }

    public Doctor(String name, String email, String mobileNumber, String qualification, int experience) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.qualification = qualification;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Doctor Details\nName: " + name + "\nEmail: " + email + "\nMobileNumber: " + mobileNumber
                + "\nQualification: " + qualification + "\nExperience: " + experience;
    }
}

