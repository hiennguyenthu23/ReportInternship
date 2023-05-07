package lms;

import java.util.Objects;

public class exercise {

    //Fill your code

    boolean flag = false;

    String name;
    String username;
    String password;
    long phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public boolean comparePhoneNumber(exercise user) {
        //Fill your code

        return Objects.equals(this.phoneNumber, user.phoneNumber);

    }
    public exercise(String name, String UserName, String Password, Long PhoneNumber) {
        this.name = name;
        this.username = UserName;
        this.password = Password;
        this.phoneNumber = PhoneNumber;
    }
}

