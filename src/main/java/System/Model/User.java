package System.Model;


import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;

public class User {

    private String name;
    private String password;
    private BigInteger phoneNumber ;

    public  User(){

    }

    public User(String name, String password, BigInteger phoneNumber) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
