package org.example.projectPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class FoodCreator {
    public static TreeMap<String, Food> foodInventory = new TreeMap<>();

    public static void removeFood(Food food){
                food.setQuantity(food.getQuantity() - 1);
    }
    public static void addFood(Food food){
        int counter = 0;
        for(Food item: PetStore.cart){
            counter++;
        }
        food.setQuantity(food.getQuantity() + counter);
    }


    public static void initializeFood(String filepath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                String[] foodList = line.split("\\|");
                    if(foodList.length == 5){
                        String name = foodList[0];
                        String brand = foodList[1];
                        double price = Double.parseDouble(foodList[2]);
                        int quantity = Integer.parseInt(foodList[3]);
                        String foodCode = foodList[4];
                        Food food = new Food(name, brand, price, quantity, foodCode);
                        foodInventory.put(food.getFoodCode(), food);
                    }
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static String printReceipt(List<Food> foods) {
        String receipt = "";
        for(int i = 0; i < foods.size(); i++) {
            receipt =
                    "\nItem: " + PetStore.foodNames.get(i) +
                    "\nPrice: $" + PetStore.foodPrices.get(i) +
                    "\nThank you for your purchase!" +
                    "\n-------------------\n";

        }
        return "\n----- Receipt -----" + receipt + "\nThank you for your purchase!" +
                "\n-------------------\n";
    }
}
