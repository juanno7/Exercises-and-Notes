package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please supply a temp: ");
        int temp = Integer.parseInt(scanner.nextLine());
        System.out.println("Is it (C)elsius or (F)ahrenheit?: ");
        String degree = scanner.nextLine();
        int conversion = 0;
        if(degree.toLowerCase().equals("c") || degree.toUpperCase().equals("C")){
        conversion = (temp * (9/5)) + 32;
            System.out.println("The conversion of: " + temp + degree.toUpperCase() + " to Fahrenheit is: " + conversion + "F");
        } else{
            conversion = (temp - 32) * 5/9;
            System.out.println("The conversion of: " + temp + degree.toUpperCase() + " to Celsius is: " + conversion + "C");
        }

    }
}
