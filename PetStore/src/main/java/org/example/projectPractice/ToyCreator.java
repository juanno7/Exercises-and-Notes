package org.example.projectPractice;

public class ToyCreator {

    public static Toys ball = new Toys("Bouncy Ball", "Ball", 5.00, 5);
    public static Toys bone = new Toys("Big Bone", "Bone", 10.99, 5);
    public static Toys mouse = new Toys("CatNip Filled Mouse", "Plush", 6.99, 5);

    public static void addToys(){
        Toys.toyList.add(ball);
        Toys.toyList.add(bone);
        Toys.toyList.add(mouse);
    }
}
