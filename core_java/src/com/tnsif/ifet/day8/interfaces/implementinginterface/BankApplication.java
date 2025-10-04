package com.tnsif.ifet.day8.interfaces.implementinginterface;

public class BankApplication {
	public static void main(String[] args) {
	     // Create a Bank instance
	     Bank bank = new BankImpl();

	     // Create an Account
	     Account account = new Account(123456, "Barath", 155000, bank);

	     // Deposit money
	     account.deposit(2000);
	     // Print the account details
	     System.out.println(account);
	     
	     //withdraw money
	     account.withdraw(20000);
	     // Print the account details
	     System.out.println(account);
	 }

}
