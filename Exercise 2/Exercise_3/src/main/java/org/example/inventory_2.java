package org.example;

import java.util.Scanner;

public class inventory_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_INVENTORY = 100;
        String[] inventory = new String[MAX_INVENTORY];
        int itemCount = 0;

        while(true){
            System.out.println("\nInventory Menu: ");
            System.out.println("\n1. Add item to inventory");
            System.out.println("2. Remove item from inventory");
            System.out.println("3. List all items in inventory");
            System.out.println("4. Exit inventory");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 4){
                System.out.println("Exiting inventory..");
                System.out.println("Thank you for using your personal inventory");
                break;
            }
            switch (choice){
                case 1:
                    if(itemCount < MAX_INVENTORY){
                        System.out.println("\nEnter the name of the item you want to add");
                        String newItem = scanner.nextLine();
                        inventory[itemCount] = newItem;
                        itemCount++;
                        System.out.println("\n" + newItem + " was added to the inventory.");

                    } else{
                        System.out.println("Inventory full cannot add item.");
                    }
                    break;
                case 2:
                    if(itemCount > 0){
                        System.out.println("Enter the name of the item you want to remove.");
                        String itemToRemove = scanner.nextLine();;
                        Boolean isRemoved = false;
                        for(int i = 0; i < itemCount; i++){
                            if(inventory[i] != null || inventory[i].equalsIgnoreCase(itemToRemove)){
                                for(int j = i; j < itemCount - 1; j++){
                                    inventory[j] = inventory[j + 1];
                                }
                                inventory[itemCount - 1] = null;
                                itemCount--;
                                isRemoved = true;
                                System.out.println(itemToRemove + " was removed.");
                                break;
                            }

                        }
                        if(!isRemoved){
                            System.out.println("Item not found.");
                        } else{
                            if(itemCount == 0){
                                System.out.println("Inventory is empty.");
                            }
                            break;
                        }
                    }
                case 3:

                    if(itemCount > 0){
                        System.out.println("\nItems in inventory: ");
                        for(int i = 0; i < itemCount; i++){

                            System.out.println((i + 1) + ". " + inventory[i]);
                        }
                    } else{
                        if(itemCount == 0){
                            System.out.println("Inventory is empty.");
                        }
                        break;
                    }
            }


        }
    }
}
