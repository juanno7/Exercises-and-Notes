package org.example.projectPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class ToyCreator {

    public static TreeMap<String, Toys> toyInventory = new TreeMap<>();

    public static void initializeToys(String filepath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                String[] toys = line.split("\\|");
                if(toys.length == 5){
                    String name = toys[0];
                    String type = toys[1];
                    Double price = Double.parseDouble(toys[2]);
                    int quantity = Integer.parseInt(toys[3]);
                    String toyCode = toys[4];
                    Toys toy = new Toys(name, type, price, quantity, toyCode);
                    toyInventory.put(toy.getToyCode(), toy);
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
