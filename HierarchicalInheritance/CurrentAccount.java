package com.techlabs.inheritance;

//Hierarchical Inheritance

public class CurrentAccount extends Account{
	private double interest;
	
	void setCurrentAccount(double interest)
	{
		this.interest = interest;
	}
	
	void displayCurrentAccount()
	{
		System.out.println("Interest: "+interest);
	}
}
