package org.example.projectPractice;

import java.util.ArrayList;
import java.util.List;

public class Pets {

    private String name;
    private String breed;
    private String color;
    private String availability;
    private int age;
    private double price;

    public static List<Pets> petList = new ArrayList<>();

    public Pets() {

    }

    public Pets(String name, String breed, String color, String availability, int age, double price) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.availability = availability;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<Pets> getPetList() {
        return petList;
    }

}
