package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please supply the width and length of a rectangle (space separated) :");
        String[] measurements = scanner.nextLine().split(" ");

        for(String i : measurements){
            int width = Integer.parseInt(i);
            int length = Integer.parseInt(i);
            int area = width * length;
            System.out.println("The area of the rectangle is: " + area);
            break;
        }

    }
}