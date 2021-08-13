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
public class Category {
    private String category_ID;
    private String category_Name;
    private String company;
    private String description;

    public Category() {
    }

    public Category(String category_ID, String category_Name, String company, String description) {
        this.category_ID = category_ID;
        this.category_Name = category_Name;
        this.company = company;
        this.description = description;
    }

    public String getCategory_ID() {
        return category_ID;
    }

    public void setCategory_ID(String category_ID) {
        this.category_ID = category_ID;
    }

    public String getCategory_Name() {
        return category_Name;
    }

    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" + "category_ID=" + category_ID + ", category_Name=" + category_Name + ", company=" + company + ", description=" + description + '}';
    }
    
    
}
