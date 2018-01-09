package com.timjones;

public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private double phoneNumber;

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

    public void setPhoneNumber(double phoneNumber) {
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

    public double getPhoneNumber() {
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
