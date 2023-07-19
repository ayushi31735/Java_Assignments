package com.techlabs.inheritance;

//Hierarchical Inheritance

public class SavingAccount extends Account{
	private double balance;
	
	void setSavingAccount(double balance)
	{
		this.balance = balance;
	}
	
	void displaySavingAccount()
	{
		System.out.println("Balance: "+balance);
	}
}
