package org.example;

public class Bird extends Animal{
    private int wingSpan;
    public Bird(String name, String species, int wingSpan) {
        super(name, species);
        this.wingSpan = wingSpan;
    }
    public void speak(){
        System.out.println(name + " the " + species + " chirps.");
    }

    public void fly(){
        System.out.println(name + " is flying with a wingspan of " + wingSpan + " inches");
    }
}
