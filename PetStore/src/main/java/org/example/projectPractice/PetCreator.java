package org.example.projectPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeMap;

public class PetCreator {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
    private static Date now = new Date();
    private Pets pet = new Pets();
    private static Scanner scanner = new Scanner(System.in);

    public static TreeMap<String, Pets> petInventory = new TreeMap<>();

//   public static Pets ramona = new Pets("Ramona", "Cat", "Orange Brown White", "Available", 10, 110.00);
//   public static Pets qat = new Pets("Qat", "Cat", "Black", "Available", 6, 110.00);

//    public static void addPetsToList(){
//        Pets.petList.add(ramona);
//        Pets.petList.add(qat);
//    }
    public static void removePet(Pets pet){
        pet.setAvailability("Unavailable");
    }

    public static void renamePet(Pets pet){
        System.out.println("Would you like to rename your pet? \nY/N");
        String answer = scanner.nextLine();
        if(answer.equals("Y")){
            System.out.print("Please enter your pets new name: ");
            String name = scanner.nextLine();
            pet.setName(name);
            System.out.println("Your pet's name is now: " + pet.getName() + "\n");
        } else{
            System.out.println("Your pet's name remains as: " + pet.getName() + "\n");
        }
    }

    public static String petCertificate(Pets pet){
        String formattedDate = dateFormat.format(now);
        return "\n----- Certificate -----" +
                "\nPet Name: " + pet.getName() +
                "\nSpecies: " + pet.getBreed() +
                "\nColor: " + pet.getColor() +
                "\nAge: " + pet.getAge() +
                "\nAdoption Price: $" + Money.fullPrice(pet.getPrice()) +
                "\nDate of Adoption: " + formattedDate +
                "\nThank you for finding " + pet.getName() + " a home!" +
                "\n-------------------\n";
    }

    public static void initializePets(String filePath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] pets = line.split("\\|");
                if(pets.length == 6){
                    String petName = pets[0];
                    String breed = pets[1];
                    String color = pets[2];
                    String available = pets[3];
                    int age = Integer.parseInt(pets[4]);
                    double price = Double.parseDouble(pets[5]);
                    Pets animal = new Pets(petName, breed, color, available, age, price);
                    petInventory.put(animal.getName(), animal);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
