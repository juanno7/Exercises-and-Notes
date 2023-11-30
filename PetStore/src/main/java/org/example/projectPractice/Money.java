package org.example.projectPractice;

import java.util.Scanner;

public class Money {
    private static double amountOfMoney;
    private static Scanner scanner = new Scanner(System.in);

    public static double getAmountOfMoney() {
        return amountOfMoney;
    }

    public static void setAmountOfMoney(double amountOfMoney) {
        Money.amountOfMoney = amountOfMoney;
    }

    public static String fullPrice(double price){
        return String.format("%.2f", price);
    }

    public static void feedMoney(){
        System.out.println("Please insert money: ");
        double money = scanner.nextDouble();
        double currentBalance = amountOfMoney += money;
        setAmountOfMoney(currentBalance);
        System.out.println("Current balance : $" + fullPrice(currentBalance));
    }

    public static void finish(Double amountOfMoney){
        double change = amountOfMoney;
        System.out.println("Change: $" + fullPrice(change));
        setAmountOfMoney(0);
    }

    public static void transaction(double price){
        setAmountOfMoney(amountOfMoney - price);
        System.out.println("Current Balance: $" + fullPrice(amountOfMoney));
    }
}
