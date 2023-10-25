package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import static org.example.Task.*;


public class TaskManager {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(true) {
            System.out.println("1. Add a new task.");
            System.out.println("2. View all tasks");
            System.out.println("3. Save tasks to a text file");
            System.out.println("4. Quit the program");

            System.out.print("\nEnter your choice: ");

           int choice = scanner.nextInt();
           scanner.nextLine();

            if (choice == 4) {
                System.out.println("Now exiting program..");
                System.out.println("\nProgram closed");
                break;
            }



            switch (choice) {
                case 1:

                    addTask();

                    break;

                case 2:
                    viewAllTasks();
                    break;

                case 3:
                    System.out.print("\nEnter the file you want to save to: ");
                    String file = scanner.nextLine();
                    saveTasksToFile(file);
                    break;



            }

        }
        scanner.close();
    }



}
