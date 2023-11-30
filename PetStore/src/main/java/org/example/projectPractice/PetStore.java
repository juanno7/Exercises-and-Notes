package org.example.projectPractice;

import java.util.Scanner;

public class PetStore {
    private static final Scanner scanner = new Scanner(System.in);

    private static Pets pet = new Pets();
    private static Food food = new Food();
    private static Toys toy = new Toys();
    private static PetCreator petCreator = new PetCreator();


    public static String availability(int quantity){
        return quantity > 0 ? Integer.toString(quantity) : "SOLD OUT";
    }

    public static void adoptAPet(){
        System.out.println("\nAvailable Funds: $" + Money.fullPrice(Money.getAmountOfMoney()) + "\n");
        System.out.print("Press 'Enter' to come in!");
        scanner.nextLine();
        System.out.print("Select the name of the pet you would like to adopt: ");
        String name = scanner.nextLine();
        boolean adopted = false;
        for (Pets pet : Pets.petList) {
            if (name.equals(pet.getName()) && Money.getAmountOfMoney() >= pet.getPrice() && pet.getAvailability().equals("Available")) {
                String certificate = PetCreator.petCertificate(pet);
                System.out.println(certificate);
                PetCreator.removePet(pet);
                PetCreator.renamePet(pet);
                Money.transaction(pet.getPrice());
                Logger.certificateLogger(PetCreator.petCertificate(pet));
                adopted = true;
                break;  // Exit the loop once a suitable pet is found
            }
        }

        if(!adopted){
            System.out.println("Please select an Available pet or add Sufficient Funds");
            System.out.println("Available funds: $" + Money.fullPrice(Money.getAmountOfMoney()));
            System.out.println("\nInsert Money? Y/N");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                Money.feedMoney();
                adoptAPet();
            }
            adoptAPet();
        }

    }

    public static void buyFood() {
        foodDisplay();
        System.out.println("\nAvailable Funds: $" + Money.fullPrice(Money.getAmountOfMoney()) + "\n");
        System.out.print("Welcome in! \nPress 'Enter' to continue");
        scanner.nextLine();
        System.out.print("Please enter the code of the food you would like to purchase: ");
        String choice = scanner.nextLine();
        boolean found = false;

        for (Food food : Food.foodList) {
            if (choice.equals(food.getFoodCode()) && food.getQuantity() > 0 && Money.getAmountOfMoney() >= food.getPrice()) {
                String receipt = printReceipt(food);
                System.out.println(receipt);
                FoodCreator.removeFood(food);
                Money.transaction(food.getPrice());
                Logger.logger(receipt);
                found = true;
                System.out.println("\nDone shopping? Y/N");
                String answer = scanner.nextLine();
                if(answer.equalsIgnoreCase("Y")) {
                    break;  // Exit the loop once a suitable food item is found
                } else{
                    buyFood();
                }
            }
        }

        if (!found) {
            System.out.println("\nInput valid code or Insufficient funds");
            System.out.println("Available Funds: $" + Money.fullPrice(Money.getAmountOfMoney()));
            System.out.println("\nInsert Money? Y/N");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                Money.feedMoney();
                buyFood();
            }
            buyFood();
        }

    }

    public static void petDisplay(){
        for(Pets pet: Pets.petList){
            String availability = pet.getAvailability().equals("Available") ? pet.getAvailability() : "Unavailable";
            System.out.println("\n" + pet.getName() + " | " + pet.getBreed() + " | " + availability);
        }
        System.out.println("\n");
    }

    public static void toyDisplay(){
        for(Toys toy: Toys.toyList){
            System.out.println("\n" + toy.getName() + " | " + "$" + Money.fullPrice(toy.getPrice()) + " | " + availability(toy.getQuantity()));
        }
    }

    public static void foodDisplay(){
        for(Food food: Food.foodList){
            System.out.println("\n" + food.getName() + " | " + "$" + Money.fullPrice(food.getPrice()) + " | " + availability(food.getQuantity()) + " | " + food.getFoodCode());
        }
    }

    public static void adoptionMenu(){
        System.out.println("\nWelcome to the Adoption Center!\n" + "\nBelow are the Pets Available for Adoption");
        System.out.println("-----------------------------------------------------------------------------------");
        for(Pets pet: Pets.petList){
            if(pet.getAvailability().equals("Available")) {
                String availability = pet.getAvailability().equals("Available") ? pet.getAvailability() : "Unavailable";
                System.out.println("\n" + pet.getName() + " | " + pet.getBreed() + " | " + availability + " | $" + Money.fullPrice(pet.getPrice()));
            }
        }
        adoptAPet();
    }

    public static String printReceipt(Food purchasedFood) {
        return "\n----- Receipt -----" +
                "\nItem: " + purchasedFood.getName() +
                "\nPrice: $" + purchasedFood.getPrice() +
                "\nThank you for your purchase!" +
                "\n-------------------\n";

    }


}
