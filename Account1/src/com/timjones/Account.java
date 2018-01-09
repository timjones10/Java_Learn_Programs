package com.timjones;

public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Account() {
        this(12345, 0.00, "Default name",
                "Default email", 123456);
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println( "Your balance has been updated");
    }

    public void withdrawFunds(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficent Funds");
        } else {
            this.balance -= amount;
            System.out.println("Your balance has been updated");
        }
    }
}
