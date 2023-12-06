package org.example.projectPractice;

import java.util.ArrayList;
import java.util.List;

public class Toys {
    private String name;
    private String type;
    private double price;
    private int quantity;
    private String toyCode;
    public static List<Toys> toyList = new ArrayList<>();

    public Toys() {
    }

    public Toys(String name, String type, double price, int quantity, String toyCode) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.toyCode = toyCode;
    }

    public String getToyCode() {
        return toyCode;
    }

    public void setToyCode(String toyCode) {
        this.toyCode = toyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
