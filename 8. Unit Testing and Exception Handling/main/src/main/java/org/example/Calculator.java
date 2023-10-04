package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true) {
            System.out.println("\n\nMenu: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Please select a choice (number): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you! \nBye!");
                break;
            }
            double num1, num2, result;

            System.out.println("Please enter the first number: ");
            num1 = scanner.nextInt();
            System.out.println("Please enter the second number: ");
            num2 = scanner.nextInt();
            switch (choice){
                case 1:
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if(num2 == 0){
                        System.out.println("Cannot divide by 2!");
                    } else {
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                }
                    break;
            }

        }

    }

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2){
        return num1 / num2;
    }
}