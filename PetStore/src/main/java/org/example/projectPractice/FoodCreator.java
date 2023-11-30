package org.example.projectPractice;

public class FoodCreator {
    public static Food catKibble = new Food("Purina 1", "Purina", 15.99, 5, "A01");
    public static Food dogKibble = new Food("Purina Basics", "Purina", 16.99,5, "A02");
    public static Food wetFood = new Food("Chicken Gravy", "Fancy Feast", 2.99,5, "A03");

    public static void addFood(){
        Food.foodList.add(catKibble);
        Food.foodList.add(dogKibble);
        Food.foodList.add(wetFood);
    }

    public static void removeFood(Food food){
        food.setQuantity(food.getQuantity() - 1);
    }
}
