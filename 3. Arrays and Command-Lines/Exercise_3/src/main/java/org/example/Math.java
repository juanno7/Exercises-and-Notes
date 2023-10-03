package org.example;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        System.out.println("Is your equation addition or subtraction ");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        System.out.println("Please supply the two numbers in order with space separation");
        String[] number = scanner.nextLine().split(" ");

        for(String i : number){
            int firstNumber = Integer.parseInt(i);
            int secondNumber = Integer.parseInt(number[1]);
            int result = 0;
            if(equation.toLowerCase().equals("addition") || equation.equals("Addition")){
                result = firstNumber + secondNumber;
                equation = "+";
            } else if(equation.toLowerCase().equals("subtraction") || equation.equals("Subtraction")){
                result = firstNumber - secondNumber;
                equation = "-";
            }
            System.out.println("The result of " + firstNumber + " " + equation + " " + secondNumber + " = " + result);
            break;
        }




    }
}
