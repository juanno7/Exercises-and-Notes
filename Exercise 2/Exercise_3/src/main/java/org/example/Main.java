package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java CommandLineCalculator <number1> <operation> <number2>");
            return;
        }

        // Parse the command-line arguments
        double num1 = Double.parseDouble(args[0]);
        String operation = args[1];
        double num2 = Double.parseDouble(args[2]);

        // Perform the mathematical operation based on the provided operator
        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Unsupported operation. Supported operations are +, -, *, and /.");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);

    }
}