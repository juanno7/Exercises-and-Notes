package org.example;

public class Main {
    public static void main(String[] args) {
        Bird parrot = new Bird("Polly", "Parrot", 10);
        Mammal lion = new Mammal("Simba", "Lion", 4);

        parrot.fly();
        parrot.speak();

        lion.walk();
        lion.speak();
    }
}