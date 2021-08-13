/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Phuong Nguyen
 */
public class User {
    private String user_ID;
    private String name;
    private String birthdate;
    private String address;
    private String phoneNumber;
    private String email;
    private String acc_ID;

    public User() {
    }

    public User(String user_ID, String name, String birthdate, String address, String phoneNumber, String email, String acc_ID) {
        this.user_ID = user_ID;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.acc_ID = acc_ID;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcc_ID() {
        return acc_ID;
    }

    public void setAcc_ID(String acc_ID) {
        this.acc_ID = acc_ID;
    }

    @Override
    public String toString() {
        return "User{" + "user_ID=" + user_ID + ", name=" + name + ", birthdate=" + birthdate + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", acc_ID=" + acc_ID + '}';
    }
    
    
}
