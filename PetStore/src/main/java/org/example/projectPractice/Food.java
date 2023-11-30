package org.example.projectPractice;

import java.util.ArrayList;
import java.util.List;

public class Food {
    private String name;
    private String brand;
    private double price;
    private int quantity;
    private String foodCode;
    public static List<Food> foodList = new ArrayList<>();

    public Food() {

    }

    public Food(String name, String brand, double price, int quantity, String foodCode) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.foodCode = foodCode;
    }

    public String getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
