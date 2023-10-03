package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank  {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.run();



    }

    public void run(){
        customer();
        insertMoney();
        listCustomer();


    }
    List<Customer> customers = new ArrayList<>();
    List<Account> accounts = new ArrayList<>();
    public void customer(){
        Customer gooze = new Customer("123456", "689 W Alameda St", "Juan", "Parra", 90000);
        customers.add(gooze);
        Customer guppie = new Customer("654321", "4147 Heirloom Ln", "Camila", "Rodriguez", 90000);
        customers.add(guppie);
        Account account1 = new Account(100, "123456", gooze);
        accounts.add(account1);
        Account account2 = new Account(5000, "654321", guppie);
        accounts.add(account2);


    }

    public void insertMoney(){
        for(Account account: accounts){
            if(account.getOwner().getFirstName().equals("Juan")){
                account.deposit(100);
            } else{
                if(account.getOwner().getFirstName().equals("Camila")){
                    account.deposit(300);
                }
            }
        }


    }


    public void listCustomer(){
        for(Customer customer: customers) {
            System.out.println(customer.getFullName() + " lives at " + customer.address);
            for (Account account : accounts) {
                if(account.getOwner() == customer) {
                    System.out.println("Account Balance: " + account.getBalance());
                    System.out.println("\n");
                }
            }
        }

    }

    public void withDraw(){

    }




}