package com.company;

import java.text.DecimalFormat;

public class BankAccount {

    DecimalFormat df = new DecimalFormat("0.00");

    //declaring class variables
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty Constructor called");
    }
    //Setters and Getter methods for each field below
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit){
        //adding on to the balance;
        this.balance += deposit;
        System.out.println("Successfully Deposited: " + deposit);
        System.out.println("Account balance: " + df.format(this.balance));
    }
    public void withdrawl(double withdrawal){
        if(this.balance - withdrawal <= 0){
            System.out.println("Insufficient funds cannot complete withdrawal");
            System.out.println("Account balance: " + df.format(this.balance));
        }
        else{
            this.balance -= withdrawal;
            System.out.println("Successfully withdrew: " + withdrawal);
            System.out.println("Account Balance: " + df.format(balance));
        }

    }



}
