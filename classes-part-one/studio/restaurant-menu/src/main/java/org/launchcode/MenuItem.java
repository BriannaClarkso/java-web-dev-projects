package org.launchcode;

import java.time.LocalDate;

public class MenuItem {

    private String item;
    private String category;
    private String description;
    private double price;
    private final LocalDate dateadded;


    public MenuItem(String item, String category, String description, double price) {
        this.item = item;
        this.category = category;
        this.description = description;
        this.price = price;
        this.dateadded = LocalDate.now();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDateadded() {
        return dateadded;
    }
}
