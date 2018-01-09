package com.timjones;

public class Main {

    public static void main(String[] args) {
        Account current = new Account();
        current.setAccountNumber(12345678);
        current.setBalance(0);
        current.setCustomerName("Jim");
        current.setEmail("jim@jim.com");
        current.setPhoneNumber(07111101010);
        current.depositFunds(100.00);
        current.withdrawFunds(50.99);
        current.withdrawFunds(50);
    }
}