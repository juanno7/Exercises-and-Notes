package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    private String name;
    private String description;
    private String dueDate;
    private static List<Task> tasks = new ArrayList<>();

    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public static void viewAllTasks(){
        System.out.println("\nDisplaying all tasks ");
        System.out.println(" ");
        int taskCount = 1;
        for(Task i: tasks){
            System.out.println(taskCount + ". " + "Task name: " + i.getName());
            System.out.println("   Task description: " + i.getDescription());
            System.out.println("   Task due date: " + i.getDueDate());
            System.out.println(" ");
            taskCount++;
        }

    }

    public static void saveTasksToFile(String filename){
        try(FileWriter writer = new FileWriter(filename)){
            for(Task task: tasks){
                writer.write("Name: " + task.getName() + "\n");
                writer.write("\nDescription: " + task.getDescription() + "\n");
                writer.write("\nDue date: " + task.getDueDate() + "\n");
                writer.write(" ");

            }
            System.out.println("\nTasks have been saved to " + filename);
            System.out.println(" ");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void addTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhat is the task's name: ");
        String name = scanner.nextLine();
        System.out.print("Provide the description: ");
        String description = scanner.nextLine();
        System.out.print("Provide the due date: ");
        String dueDate = scanner.nextLine();
        System.out.println(" ");

        Task newTask = new Task(name, description, dueDate);
        tasks.add(newTask);
    }
}
