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
public class Order {
    private String user_ID;
    private String userName;
    private String birdthdate;
    private String address;
    private String phoneNumber;
    private String email;
    private String accID;
    private String order_ID;
    private String order_Date;
    private String delevery_Status;
    private String phone_ID;
    private String orderDetail_ID;
    private int amount;
    private float total;
    private String discription;

    public Order() {
    }

    public Order(String user_ID, String userName, String Birdthdate, String Address, String phoneNumber, String email, String accID, String order_ID, String order_Date, String delevery_Status, String phone_ID, String orderDetail_ID, int amount, float total, String discription) {
        this.user_ID = user_ID;
        this.userName = userName;
        this.birdthdate = Birdthdate;
        this.address = Address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.accID = accID;
        this.order_ID = order_ID;
        this.order_Date = order_Date;
        this.delevery_Status = delevery_Status;
        this.phone_ID = phone_ID;
        this.orderDetail_ID = orderDetail_ID;
        this.amount = amount;
        this.total = total;
        this.discription = discription;
    }

    
    
    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirdthdate() {
        return birdthdate;
    }

    public void setBirdthdate(String Birdthdate) {
        this.birdthdate = Birdthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = Address;
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

    public String getAccID() {
        return accID;
    }

    public void setAccID(String accID) {
        this.accID = accID;
    }

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }

    public String getOrder_Date() {
        return order_Date;
    }

    public void setOrder_Date(String order_Date) {
        this.order_Date = order_Date;
    }

    public String getDelevery_Status() {
        return delevery_Status;
    }

    public void setDelevery_Status(String delevery_Status) {
        this.delevery_Status = delevery_Status;
    }

    public String getPhone_ID() {
        return phone_ID;
    }

    public void setPhone_ID(String phone_ID) {
        this.phone_ID = phone_ID;
    }

    public String getOrderDetail_ID() {
        return orderDetail_ID;
    }

    public void setOrderDetail_ID(String orderDetail_ID) {
        this.orderDetail_ID = orderDetail_ID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Order{" + "user_ID=" + user_ID + ", userName=" + userName + ", Birdthdate=" + birdthdate + ", Address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", accID=" + accID + ", order_ID=" + order_ID + ", order_Date=" + order_Date + ", delevery_Status=" + delevery_Status + ", phone_ID=" + phone_ID + ", orderDetail_ID=" + orderDetail_ID + ", amount=" + amount + ", total=" + total + ", discription=" + discription + '}';
    }

    

    
}
