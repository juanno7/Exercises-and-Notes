package org.example.projectPractice;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();
//        PetCreator.addPetsToList();
        PetCreator.initializePets("Pets.txt");
        FoodCreator.initializeFood("Food.txt");
        ToyCreator.initializeToys("Toys.txt");
//        ToyCreator.addToys();
//        FoodCreator.addFood();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to The Gupgooze Pet Store!");
        System.out.println("-------------------------------------");
        System.out.print("Press enter to come in!");
        scanner.nextLine();

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
                    PetStore.adoptAPet();
                    break;
                case 6:
                    petStore.buyFood();
                    break;

            }
        }

    }
}
