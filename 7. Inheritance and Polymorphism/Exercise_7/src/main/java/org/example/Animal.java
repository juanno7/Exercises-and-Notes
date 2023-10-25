package org.example;

public class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void speak(){
        System.out.println(name + " the " + species + " makes a sound");
    }
}
