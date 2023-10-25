package org.example;

public class Mammal extends Animal{
    private int numLegs;
    public Mammal(String name, String species, int numLegs) {
        super(name, species);
        this.numLegs = numLegs;
    }

    public void speak(){
        System.out.println(name + " the " + species + " roars");
    }

    public void walk(){
        System.out.println(name + " is walking on " + numLegs+ " legs");
    }
}
