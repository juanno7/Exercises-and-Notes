package org.example.projectPractice;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PetCreator.addPetsToList();
        ToyCreator.addToys();
        FoodCreator.addFood();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to The Pet Store!");

        while (true){
            System.out.println("\n1. Browse Adoption Selection");
            System.out.println("2. Browse Toy Selection");
            System.out.println("3. Browse Food Selection");
            System.out.println("4. Feed Money");
            System.out.println("5. Adopt A Pet");
            System.out.println("6. Purchase Food");
            System.out.println("7. Purchase Toys");
            System.out.println("8. Exit");

            System.out.print("\nEnter Your Choice: ");

            int choice = scanner.nextInt();

            if(choice == 8){
                Money.finish(Money.getAmountOfMoney());
                break;
            }

            switch (choice){
                case 1:
                    PetStore.petDisplay();
                    break;
                case 2:
                    PetStore.toyDisplay();
                    break;
                case 3:
                    PetStore.foodDisplay();
                    break;
                case 4:
                    Money.feedMoney();
                    break;
                case 5:
                    PetStore.adoptionMenu();
                    break;
                case 6:
                    PetStore.buyFood();
                    break;

            }
        }

    }
}
