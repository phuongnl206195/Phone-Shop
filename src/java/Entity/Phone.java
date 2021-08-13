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
public class Phone {
    private String phone_ID;
    private String name;
    private String memory;
    private int quantity;
    private float price;
    private String image;
    private String description;
    private String date;
    private String category_ID;
    private int amount;

    public Phone() {
    }

    public Phone(String phone_ID, String name, String memory, int quantity, float price, String image, String description, String date, String category_ID) {
        this.phone_ID = phone_ID;
        this.name = name;
        this.memory = memory;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
        this.description = description;
        this.date = date;
        this.category_ID = category_ID;
    }

    public Phone(String phone_ID, String name, String memory, int quantity, float price, String image, String description, String date, String category_ID, int amount) {
        this.phone_ID = phone_ID;
        this.name = name;
        this.memory = memory;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
        this.description = description;
        this.date = date;
        this.category_ID = category_ID;
        this.amount = amount;
    }

    public String getPhone_ID() {
        return phone_ID;
    }

    public void setPhone_ID(String phone_ID) {
        this.phone_ID = phone_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory_ID() {
        return category_ID;
    }

    public void setCategory_ID(String category_ID) {
        this.category_ID = category_ID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    
    @Override
    public String toString() {
        return "Phone{" + "phone_ID=" + phone_ID + ", name=" + name + ", memory=" + memory + ", quantity=" + quantity + ", price=" + price + ", image=" + image + ", description=" + description + ", date=" + date + ", category_ID=" + category_ID + ", amount=" + amount + '}';
    }
    
    
}

