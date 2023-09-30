package org.example;

import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set the initial size of the inventory
        final int MAX_INVENTORY_SIZE = 100;
        String[] inventory = new String[MAX_INVENTORY_SIZE];
        int itemCount = 0;

        while (true) {
            System.out.println("\nInventory System Menu:");
            System.out.println("1. Add item to inventory");
            System.out.println("2. Remove item from inventory");
            System.out.println("3. List all items in inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 4) {
                System.out.println("Now exiting inventory.");
                break;
            }

            switch (choice){
                case 1:
                    if(itemCount < MAX_INVENTORY_SIZE){
                        System.out.println("Enter the name of the item you want to add: ");
                        String newItem = scanner.nextLine();
                        inventory[itemCount] = newItem;
                        itemCount++;
                        System.out.println(newItem + " was added to the inventory.");

                    } else {
                        System.out.println("Inventory is full. Cannot add item.");
                    }
                    break;
                case 2:
                    if(itemCount > 0){
                        System.out.println("Enter the name of the item you want to remove: ");
                        String itemToRemove = scanner.nextLine();
                        boolean itemRemoved = false;
                        for(int i = 0; i < itemCount; i++){
                            if(inventory[i] != null && inventory[i].equalsIgnoreCase(itemToRemove)){
                                for(int j = i; j < itemCount - 1; j++){
                                    inventory[j] = inventory[j + 1];
                                }
                                inventory[itemCount - 1] = null;
                                itemCount --;
                                itemRemoved = true;
                                System.out.println(itemToRemove + " was removed from inventory");
                                break;
                            }
                        }
                        if(!itemRemoved){
                            System.out.println("Item not found in inventory.");
                        } else { if(itemCount == 0)
                            System.out.println("Inventory is empty.");
                        }
                        break;
                    }
                case 3:
                    if(itemCount > 0){
                        System.out.println("\nItems in inventory: ");
                    for(int i = 0; i < itemCount; i++) {
                        System.out.println((i + 1) + ". " + inventory[i]);
                      }
                    } else{
                        System.out.println("Inventory is empty");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. PLease select a valid choice.");
                    break;

            }

        }
    }
}
