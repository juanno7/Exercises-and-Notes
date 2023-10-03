package org.example;

public class Customer {
    private String customerId;
    public String address;
    private String firstName;
    private String lastName;
    private String fullName;
    private int salary;

    public Customer(String customerId, String address, String firstName, String lastName, int salary) {
        this.customerId = customerId;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        fullName = firstName + " " + lastName;
        return fullName;
    }
}
