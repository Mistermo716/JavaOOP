package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car honda = new Car();
//        honda.setModel("Accord");
//        System.out.println("Model is " + honda.getModel());

        BankAccount Mo = new BankAccount();

        Mo.setBalance(500.12);

        Mo.deposit(100);
        Mo.withdrawl(590);

    }
}
