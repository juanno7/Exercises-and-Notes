package org.example;

import java.util.Random;
import java.util.Scanner;

public class random_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int max = 100;
        int min = 1;
        int numberToGuess = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        System.out.println("\nWelcome to the number guessing game!");
        System.out.println("\nI have chosen a random number between " + min + " and " + max + " can you guess it?");

        while (true){
            System.out.print("\nEnter your guess: ");
            attempts++;
            int guess = scanner.nextInt();
            if(guess < min || guess > max){
                System.out.println("\nPlease guess a number between " + min + " and " + max);
                attempts++;
            } else if(guess < numberToGuess){
                System.out.println("\nThe number is higher");
                attempts++;
            } else if(guess > numberToGuess){
                System.out.println("\nThe number is lower");
                attempts++;
            } else{
                System.out.println("\nCongratulations!!! \nYou have found the number in " + attempts + " attempts!");
                break;
            }
        }
        scanner.close();
    }
}
