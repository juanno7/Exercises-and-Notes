package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inventWithList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int MAX_INVENTORY = 5;
        List<String> inventory = new ArrayList<>();

        while (true) {
            System.out.println("\nInventory Menu: ");
            System.out.println("1. Add to inventory");
            System.out.println("2. Remove from inventory");
            System.out.println("3. List all items");
            System.out.println("4. Exit inventory");
            System.out.println("\nEnter your choice");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 4) {
                System.out.println("Now exiting inventory..");
                System.out.println("\nInventory closed");
                break;
            }

            switch (choice) {
                case 1:
                    if(inventory.size() < MAX_INVENTORY){
                        System.out.println("Name the item you want to add");
                        String newItem = scanner.nextLine();
                        inventory.add(newItem);
                        System.out.println("\n" + newItem + " was added to inventory");
                    } else {
                        System.out.println("Inventory is full cannot add item");
                    }
                    break;
                case 2:
                    if(!inventory.isEmpty()){
                        System.out.println("Name the item you want to remove");
                        String itemToRemove = scanner.nextLine();
                        boolean isRemoved = inventory.remove(itemToRemove);
                        if(isRemoved){
                            System.out.println("\n" + itemToRemove + " was removed from inventory");
                        } else{
                                System.out.println("Item not found");
                        }
                    } else {
                        System.out.println("Inventory is empty");

                    }
                    break;
                case 3:
                    if(!inventory.isEmpty()){
                        System.out.println("Inventory items: ");
                        for(int i = 0; i < inventory.size(); i++){
                            System.out.println((i + 1) + ". " + inventory.get(i));
                        }
                    } else{
                        System.out.println("Inventory is empty");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
